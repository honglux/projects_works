import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

//class to use as an client;
public class MyClient {

    private String host;
    private int port;

    public Socket getClientSocket() {
        return clientSocket;
    }

    public void setClientSocket(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    private Socket clientSocket;

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    private OutputStream outputStream;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setUpConnection() throws Exception{ //set connection;
        setUpConnection(this.host,this.port);
    }

    public void setUpConnection(String host,int port) throws Exception{ //set connection;
        this.clientSocket = new Socket(host,port);
        outputStream = this.clientSocket.getOutputStream();
    }

    public void sendData(byte[] data) throws Exception{
        this.outputStream.write(data);
    }

    public void flush() throws Exception{
        this.outputStream.flush();
    }

    public void close() throws Exception{
        this.clientSocket.close();
    }
}
