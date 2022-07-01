package UDPdemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(33333);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入：");
            String msg = sc.nextLine();
            if("exit".equals(msg))
            {
                System.out.println("成功退出");
                ds.close();
                break;
            }
            byte[] b = msg.getBytes();
            DatagramPacket dp = new DatagramPacket(b,b.length, InetAddress.getLocalHost(),55555);
            ds.send(dp);
        }
    }
}
