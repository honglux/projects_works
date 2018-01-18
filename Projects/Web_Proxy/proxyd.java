import java.net.*;
import java.util.HashMap;

//main class;
public class proxyd {

    //main method;
    public static void main(String[] args) throws Exception{

        //check if all the main arguments are valid;
        if (args.length != 2){
            throw new Exception("invalid arguments");
        }else if (args[0].compareTo("-port") != 0){
            throw new Exception("Please enter the right command");
        }

        DNSCache.DNSCache = new HashMap<String, String[]>();    //initial DNSCache;
        ServerSocket welcomeSocket = new ServerSocket(Integer.parseInt(args[1]));    //define my server socket;
        int threadIteration = 0;    //threads counter;
        System.out.println("proxy started.");
        while (threadIteration<1000) {  //limit thread number to 1000;
            Socket mySocket = welcomeSocket.accept();   //welcome socket from browser;
            threadIteration++;
            new ProxyThread(mySocket);  //new a Thread for each connection from browser;
            System.out.println("threadIteration "+threadIteration);
        }



    }

}
