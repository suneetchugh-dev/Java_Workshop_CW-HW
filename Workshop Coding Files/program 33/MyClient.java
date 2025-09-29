import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            // 1. Connect to server at localhost on port 5000
            Socket s = new Socket("localhost", 5000);

            // 2. Create output/input streams
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());

            // For user input from keyboard
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 3. Take input from user
            System.out.print("Enter message for server: ");
            String msgToServer = br.readLine();

            // 4. Send message to server
            dos.writeUTF(msgToServer);

            // 5. Receive server response
            String msgFromServer = dis.readUTF();
            System.out.println("Server says: " + msgFromServer);

            // 6. Close connections
            dos.close();
            dis.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}