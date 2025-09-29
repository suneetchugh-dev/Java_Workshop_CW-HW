import java.net.ServerSocket;
import java.net.Socket;

class My_server
{
    public static void main(String[] args) {
        try
        {
            System.out.println("Waiting for client request");
            ServerSocket ss = new ServerSocket(8000);
            Socket sos = ss.accept();
            System.out.println("Connection Done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}