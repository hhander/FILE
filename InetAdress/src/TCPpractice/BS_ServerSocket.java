package TCPpractice;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BS_ServerSocket {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8080);
        while (true)
        {
            Socket socket = ss.accept();
            new ServerSocketReadThread(socket).start();
        }

    }
}

class ServerSocketReadThread extends Thread {

    private Socket socket;

    public ServerSocketReadThread(Socket s)
    {
        this.socket = s;
    }

    @Override
    public void run() {
        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();
            ps.println("<span style='color:red;font-size:90px'> 瓜 子 是 猪</span>");
            ps.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

