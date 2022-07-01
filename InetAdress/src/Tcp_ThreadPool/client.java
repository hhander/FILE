package Tcp_ThreadPool;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 33333);
            OutputStream os = s.getOutputStream();
            PrintStream ps = new PrintStream(os);
            String msg;
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                System.out.println("请输入");
                msg = sc.nextLine();
                ps.println(msg);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
