package Tcp_ThreadPool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyRunnable implements Runnable{

    private Socket socket;

    public MyRunnable(Socket s)
    {
        this.socket = s;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String msg;
            while((msg = br.readLine())!=null)
            {
                System.out.println(socket.getRemoteSocketAddress() + "说：" + msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress()+ " 已退出");;
        }
    }
}
