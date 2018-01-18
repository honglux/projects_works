import java.net.Socket;

//class to create thread for proxy;
public class ProxyThread extends Thread {

    Socket browserSocket;

    //init;
    ProxyThread(Socket socket){
        this.browserSocket = socket;
        this.start();
    }

    @Override
    public void run(){
        try{
            MyProxy myProxy = new MyProxy();
            myProxy.startProxy(this.browserSocket); //start proxy with my server socket;
        }catch (Exception e){
            throw new RuntimeException(e);
//            System.out.println(e);
        }
    }
}
