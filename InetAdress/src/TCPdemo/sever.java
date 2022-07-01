package TCPdemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class sever {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(7777);
            while(true)
            {
                Socket s = ss.accept();
                System.out.println(s.getRemoteSocketAddress() + "上线了");
                new ServerSocketThread(s).start();
            }
        } catch (IOException e) {;
        }


    }
}
