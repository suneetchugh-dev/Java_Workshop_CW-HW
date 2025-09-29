import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
          
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            
            Socket s = ss.accept();
            System.out.println("Client connected!");

            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          
            String msgFromClient = dis.readUTF();
            System.out.println("Client says: " + msgFromClient);

           
            System.out.print("Enter message for client: ");
            String msgToClient = br.readLine();

            
            dos.writeUTF(msgToClient);

            
            dis.close();
            dos.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}