package TCPdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1",7777);

        OutputStream os = s.getOutputStream();

        PrintStream ps = new PrintStream(os);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入");
            String msg = sc.nextLine();
            ps.println(msg);
        }

    }
}
