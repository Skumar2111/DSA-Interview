package ClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)) {
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Server accepts client connection");

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                PrintWriter output = new PrintWriter(socket.getOutputStream());

                while(true)
                {
                    String echoString = bufferedReader.readLine();
                    System.out.println("Server got request data : " +echoString);

                    if(echoString.equals("Exit"))
                    {
                        break;
                    }
                    output.println("Echo from server :" +echoString);
                }
            }
        }    catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
