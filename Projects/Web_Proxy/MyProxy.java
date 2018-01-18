import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;

public class MyProxy {

    //all the constant that will use later;
    private static final String hostName = "hostName";
    private static final String hostPort = "hostPort";
    private static final String hostIP = "hostIP";
    private static final int fromBrowser = 1;   //flag for source socket;
    private static final int fromServer = 2;
    private static final int delay = 7000;  //time delay to kill the thread;

    private Timer timer = new Timer();  //timer for killing the thread;
    private MyClient client;    //pretend to be a client to the web-server;
    private Socket connectionSocket;    //my server socket;
    boolean threadFlag = false; //flag to kill the thread;

    public void startProxy(Socket connection_Socket) throws Exception
    {
        this.connectionSocket = connection_Socket;
        System.out.println("Starting connection");

        Map<String,String> lineMap = new HashMap<String,String>();  //map to store the information from input-stream;
        Map<String,String> exMap = new HashMap<String, String>();   //map for extra information from input-stream;

        //use infinite loop for persistent connection;
        while(true) {
            if (threadFlag){    //check if this thread should be killed;
                return;
            }
            System.out.println("starting new loop");
            client = new MyClient();

            //start the timer, or refresh the timer;
            timer.cancel();
            timer.purge();
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    try{
                        endThread();
                    }catch (Exception e){}

                }
            }, delay);

            //clear all the cache from last loop;
            lineMap.clear();
            exMap.clear();

            InputStream inputStream = connectionSocket.getInputStream();    //my server input-stream;
            String data = new String(); //String to store the whole HTTP-header;
            data = getInStremData(inputStream,lineMap,fromBrowser); //get header;
            System.out.print("data "+data);
            if (threadFlag){    //whenever it is, end thread if timer out;
                return;
            }

            //check all the tags from header;
            if (lineMap.get("CONNECT") != null){    //https detected, abort;
                this.endThread();
                return;
            }

            String[] hostTemp;
            try{
                hostTemp =
                        (new String(lineMap.get("Host:")).split(" ")[1]).split(":");    //(Host:) ((www.cnn.com):(5050))
            }catch (Exception e){
                hostTemp = new String[1];   //handle the situation that "Host:" doest not contained in header;
                System.out.println(e);
            }
            try {
                exMap.put(hostName,hostTemp[0].split("\r\n")[0]);   //(www.cnn.com)
            }catch (Exception e){
                System.out.println(e);
            }
            try{
                exMap.put(hostPort,hostTemp[1].split("\r\n")[0]);   //(5050)
            }catch (Exception e){
                exMap.put(hostPort,"80");       //use default port number if not port included;
            }
            String address;
            if (DNSCache.DNSCache.containsKey(exMap.get(hostName))){    //check if the host name already contained in DNS cache;
                if (System.currentTimeMillis()
                        - Long.parseLong(DNSCache.DNSCache.get(exMap.get(hostName))[1]) > 30000){   //check if the time is greater than 30s;
                    address = InetAddress.getByName(new String (exMap.get(hostName)))
                            .getHostAddress();  //get IP by java method;
                    DNSCache.DNSCache.put(exMap.get(hostName)
                            ,new String[]{address,Long.toString( System.currentTimeMillis())}); //put in to DNSCache;
                }else{
                    address = DNSCache.DNSCache.get(exMap.get(hostName))[0];    //else, use DNSCache;
                }
            }else{
                address = InetAddress.getByName(new String (exMap.get(hostName)))
                        .getHostAddress();
                DNSCache.DNSCache.put(exMap.get(hostName)
                        ,new String[]{address,Long.toString( System.currentTimeMillis())});
            }
            exMap.put(hostIP,(address));    //store information;

            System.out.println("destination IP: "+exMap.get(hostIP));
            System.out.println("destination port: "+exMap.get(hostPort));

            //connect to server;
            client.setUpConnection(new String(exMap.get(hostIP))
                    ,Integer.parseInt(exMap.get(hostPort)));
            if (threadFlag){
                return;
            }
            client.sendData(data.getBytes());   //send header to web-server;
            if (threadFlag){
                return;
            }
            if(lineMap.containsKey("POST")){    //if POST used, there will be another section of binary data for the form information;
                new Thread() {  //use a new Thread for writing form data;
                    @Override
                    public void run() {
                        try {
                            transferData(connectionSocket.getInputStream()
                                    ,client.getOutputStream());
                        } catch (Exception e) {
                            throw new RuntimeException(e);
//                            System.out.println(e);
                        }
                    }
                }.start();

//                transferData(connectionSocket.getInputStream()
//                        ,client.getOutputStream());   //another option, not to new Thread;
            }
            client.flush();
            System.out.println("writing to web-server finished");

            //get server response;
            lineMap.clear();
            data = "";
            data = getInStremData(client.getClientSocket().getInputStream(),lineMap,fromServer);    //get header from web-server;
            System.out.println("response data "+data);
            if (threadFlag){
                return;
            }

            //send response to browser;
            connectionSocket.getOutputStream().write(data.getBytes());  //write header to the browser;
            if (threadFlag){
                return;
            }
            transferData(client.getClientSocket().getInputStream()
                    ,connectionSocket.getOutputStream());   //send any other data to the browser; (image, script)
            connectionSocket.getOutputStream().flush();
            if (threadFlag){
                return;
            }

            try{
                client.close();
            }catch (Exception e){
//                System.out.println(e);
                throw e;
            }
            System.out.println("loop finished");
        }
    }

    //get and modify the header;
    //@param InputStream, information map,from flag (server, browser);
    public String getInStremData(InputStream inputStream,Map<String,String> lineMap
                                    ,int fromWhere
                                    ) throws Exception {
        if (threadFlag){    //whenever it is, end thread when time out;
            return "";
        }
        System.out.println("getInStremData");
        String lineTemp = "";   //cache for one line;
        byte[] singleByte = new byte[1];    //cache for a byte;
        int singleByteInt = 0;
        boolean slashRFlag = false; //"\r" flag;
        String data = new String(); //final Sting;
        try {
            while ((inputStream.read(singleByte, 0, 1)) != -1) {    //read byte by byte;
                lineTemp = lineTemp + (new String(singleByte));
                singleByteInt = singleByte[0] & 0xFF;   //convert byte to int;
                if (singleByteInt == 13) {  //check if "\r" appeared;
                    slashRFlag = true;
                }
                if (singleByteInt == 10 && slashRFlag == true) {    //situation for "\r\n";
                    //one line received, refresh timer;
                    this.timer.cancel();
                    timer.purge();
                    this.timer = new Timer();
                    this.timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            try {
                                endThread();
                            } catch (Exception e) {
                            }
                        }
                    }, delay);

                    //check information for this line;
                    String[] splitTemp = lineTemp.split(" ");   //(GET) (www.cnn.com) (HTTP/1.1)

                    //there conflict some bugs while loading images with relative GET, so I comment it out;
                    /*
                    if (splitTemp[0].compareTo("GET") == 0) {  //check the situation for GET;
                        String[] postFix;
                        String postFixString = "";
                        try{
                            postFix = ((((splitTemp[1]).split("//"))[1])
                                    .split("/"));
                        }catch (Exception e){
                            postFix = new String[1];
                        }
                        try{
                            postFixString = postFixString+"/";
                            for (int i =1;i<postFix.length;i++){
                                postFixString = postFixString+postFix[i]+"/";
                            }
                            lineTemp = splitTemp[0]+" "+postFixString+" "+splitTemp[2];
                        }catch (Exception e){
                            throw new Exception(lineTemp+" "+e);
                        }
                    }
                    */

                    if (splitTemp[0].compareTo("POST") == 0) {  //check the situation for POST
                        String[] postFix;
                        String postFixString = "";
                        try {
                            postFix = ((((splitTemp[1]).split("//"))[1])
                                    .split("/"));    //(POST) ((http:)//((www.cnn.com)/(home.html))) (HTTP/1.1);
                        } catch (Exception e) {
                            postFix = new String[1];
                        }
                        try {
                            postFixString = postFixString + "/";
                            for (int i = 1; i < postFix.length; i++) {
                                postFixString = postFixString + postFix[i] + "/";   //remove "www.cnn.com";
                            }
                            lineTemp = splitTemp[0] + " " + postFixString + " " + splitTemp[2]; //add back "POST", "HTTP/1.1"
                        } catch (Exception e) {
                            throw new Exception(lineTemp + " " + e);
                        }
                    }
                    if (splitTemp[0].compareTo("Connection:") == 0) {   //modify "Connection:" line;
                        switch (fromWhere) {
                            case fromBrowser: {
                                lineTemp = "Connection: close\r\n"; //if from browser, send close;
                                break;
                            }
                            case fromServer: {
                                lineTemp = "Connection: keep-alive\r\n";    //if from web-server, send keep-alive;
                                break;
                            }
                        }
                        data = data + lineTemp; //put into final String;
                        lineMap.put(splitTemp[0], lineTemp);    //put into information map;
                    } else if (splitTemp[0].compareTo("Proxy-connection:") == 0) {  //same as "Proxy-connection:";
                        switch (fromWhere) {
                            case fromBrowser: {
                                lineTemp = "Proxy-connection: close\r\n";
                                break;
                            }
                            case fromServer: {
                                lineTemp = "Proxy-connection: keep-alive\r\n";
                                break;
                            }
                        }
                        data = data + lineTemp;
                        lineMap.put(splitTemp[0], lineTemp);
                    } else {
                        data = data + lineTemp;
                        lineMap.put(splitTemp[0], lineTemp);
                    }
                    if (lineTemp.compareTo("\r\n") == 0) {
                        break;
                    }
                    lineTemp = "";
                    slashRFlag = false;
                }
            }
        }catch (Exception e){
            throw e;
//            System.out.println(e);
        }
        return data;
    }

    //method to transfer binary data;
    public void transferData(InputStream inputStream,OutputStream outputStream)
            throws Exception{
        if (threadFlag){
            return;
        }
        System.out.println("transferData");

        byte[] singleByte = new byte[1];
        int byteInteration = 0;
        while (inputStream.read(singleByte,0,1) != -1) {    //read byte by byte;
            try {
                outputStream.write(singleByte); //write after read;
                outputStream.flush();
                if ((int)singleByte[0] != -1){  //exclude the situation for meaningless data;
                    byteInteration++;
                }
            }catch (Exception e){}

            if (byteInteration >= 100){
                byteInteration = 0;

                //refresh timer for each 100 bytes read;
                this.timer.cancel();
                this.timer.purge();
                this.timer = new Timer();
                this.timer.schedule(new TimerTask(){
                    @Override
                    public void run() {
                        try{
                            endThread();
                        }catch (Exception e){}
                    }
                }, delay);
            }
        }
        outputStream.flush();
    }

    //method to end thread;
    public void endThread(){
        System.out.println("Thread end");
        try{
            this.connectionSocket.close();  //close the sockets first;
            this.client.close();
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            this.threadFlag = true; //use flag to end thread safely rather than force;
            this.timer.cancel();    //end timer;
            this.timer.purge();

            //schedule the force end;
//            this.timer = new Timer();
//            this.timer.schedule(new TimerTask(){
//                @Override
//                public void run() {
//                    try{
//                        endThreadTrue();
//                    }catch (Exception e){}
//                }
//            }, delay);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    //method to end thread by force;
//    public void endThreadTrue(){
//        System.out.println("Thread end True");
//        this.timer.cancel();    //end timer;
//        this.timer.purge();
//        try{
//            Thread.currentThread().interrupt(); //end thread;
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }

}


