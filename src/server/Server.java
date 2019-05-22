package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {


        try (
                ServerSocket serverSocket = new ServerSocket(8080);
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        ) {
            String inputLine, outputLine;





//            //start conversation
//            KKProt kkp = new KKProt();
//
//            outputLine = kkp.processInput(null);
//            out.println(outputLine);
//
//            while ((inputLine = in.readLine()) != null){
//                outputLine = kkp.processInput(inputLine);
//                out.println(outputLine);
//                if(outputLine.equals("Bye"))break;
//            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
