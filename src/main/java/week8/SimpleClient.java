package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";  // Server address (localhost)
        int serverPort = 12345;  // Port number

        try (Socket socket = new Socket(serverAddress, serverPort)) {  // Connect to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String messageToSend = "Hello, Server!";
            out.println(messageToSend);  // Send message to server

            String response = in.readLine();  // Read server response
            System.out.println("Received from server: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
