package TCPpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class severReadThread extends Thread{
    private Socket socket;
    severReadThread(Socket s)
    {
        this.socket = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg;
            while((msg = bf.readLine())!=null)
            {
                System.out.println(socket.getRemoteSocketAddress() + msg);
                SeverSend(msg);
            }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress() + "已退出");
        }

    }

    private void SeverSend(String msg) {
        for (Socket s : Server.l) {
            try {
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println(msg);
            } catch (Exception e) {
                System.out.println("下线了");
                Server.l.remove(socket);
            }
        }
    }
}
