package networking;

import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Scanner;

public class MyTimeServer {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket=new ServerSocket(2000);

        while (true) {
            System.out.println(" listening on port 2000 ....");
            Socket socket = serverSocket.accept();

            System.out.println("Connection established with  " + socket.getRemoteSocketAddress());

            //Protocol  1

            new MyTimeServerThread(socket).run();
        }


    }







}
