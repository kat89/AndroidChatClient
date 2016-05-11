package mobile.tiy.androidchatclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by kat on 5/11/2016.
 */
public class ChatClient {

    public  String sendMessage(String incomingMessage) {

        try {
            Socket clientSocket = new Socket("172.168.4.9", 8005); //establishing connection
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); //set connection on port 8005 for output stream
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out.println(incomingMessage);

        } catch (IOException ioException) {

        } return incomingMessage;
    }

}


