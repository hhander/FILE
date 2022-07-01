package TCPpractice;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ClientToClients {
    public static void main(String[] args) {



        try {
            Socket socket = new Socket("127.0.0.1",33333);

            new ClientReadThread(socket).start();

            PrintStream ps = new PrintStream(socket.getOutputStream());
            String msg;
            Scanner sc = new Scanner(System.in);
            while (true)
            {
                System.out.println("请输入");
                msg = sc.nextLine();
                ps.println("说 " + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
