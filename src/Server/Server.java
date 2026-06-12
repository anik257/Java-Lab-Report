package Server;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started, waiting for client...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            String clientId = input.readLine();
            String clientName = input.readLine();

            System.out.println("Received: " + clientId);
            System.out.println("Received: " + clientName);

            output.println("Message: received successfully!");
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}