package networking;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) throws Exception {


        System.out.println("Strating client");
        Socket socket= new Socket("127.0.0.1",2000);
        System.out.println("Connection established with server ....");

        Scanner in = new Scanner(socket.getInputStream());
        PrintWriter out = new PrintWriter(socket.getOutputStream());

        out.println("Hello");
        out.flush();
        String date= in.nextLine();
        System.out.println("Date on server is "+date);

        socket.close();
        in.close();
        out.close();

    }
}
