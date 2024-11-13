package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {  // Port 12345 for connections
            System.out.println("Server is running and waiting for a client to connect...");

            while (true) {
                Socket clientSocket = serverSocket.accept();  // Accept client connection
                System.out.println("Client connected!");

                // Create input and output streams to read from and write to the client
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String clientMessage = in.readLine();
                System.out.println("Received from client: " + clientMessage);

                String serverResponse = "Hello from the server!";
                out.println(serverResponse);  // Send response to client

                clientSocket.close();  // Close the connection
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
