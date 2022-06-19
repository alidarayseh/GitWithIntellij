package networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class MyTimeServerThread implements Runnable {
    private Socket socket;


    MyTimeServerThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
       try( Scanner in = new Scanner(socket.getInputStream());
        PrintWriter out = new PrintWriter(socket.getOutputStream()))
       {
        String line = in.nextLine();


        if (line.equalsIgnoreCase("Hello"))
        {
            Date date=new Date();
            out.println(date);
            out.flush();
        }
        else {
            System.out.println("Unknown request");
            out.flush();
        }  socket.close();}


       catch (IOException e)
       {
           e.printStackTrace();
       }


    }
}
