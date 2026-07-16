package ClientServer;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost",5000)) {

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);

            Scanner scanner = new Scanner(System.in);
            String requestString;
            String responseString;



            do
            {
                System.out.println("Enter String");
                requestString = scanner.nextLine();

                output.println(requestString);
                if(!requestString.equals("Exit"))
                {
                    responseString = input.readLine();
                    System.out.println(responseString);
                }

            }while(!requestString.equals("Exit"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Client disconnected");
        }
    }
}
