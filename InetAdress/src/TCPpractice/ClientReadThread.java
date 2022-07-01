package TCPpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReadThread extends Thread{
    private static Socket socket;

    public ClientReadThread(Socket s)
    {
        this.socket = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg;
            while((msg=br.readLine())!=null)
            {
                System.out.println(socket.getRemoteSocketAddress() + "  " + msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");

        };
    }



}
