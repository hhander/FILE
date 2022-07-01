package Tcp_ThreadPool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class server {

    private static ExecutorService es = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        ServerSocket ss = null;
        try {

            ss = new ServerSocket(33333);
            while (true)
            {
                Socket s = ss.accept();
                System.out.println(s.getRemoteSocketAddress() + "已登录");
                es.execute(new MyRunnable(s));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
