package TCPpractice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    public static List<Socket> l = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(33333);


        try {
            while(true)
            {
                Socket s = ss.accept();
                new severReadThread(s).start();
                System.out.println(s.getRemoteSocketAddress() + "上线了");
                l.add(s);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
