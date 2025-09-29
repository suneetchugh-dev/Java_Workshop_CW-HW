import java.net.ServerSocket;
import java.net.Socket;

class Client
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Client Requesting");
            Socket soc = new Socket("localhost",8000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}