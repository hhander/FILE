package UDPdemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.NetworkInterface;
import java.net.SocketException;

public class server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(55555);
        byte[] b = new byte[1024*8];
        DatagramPacket dp = new DatagramPacket(b,b.length);

        while (true) {
            ds.receive(dp);
            String msg = new String(b,0,dp.getLength());
            System.out.println("收到一条短信来自" + dp.getAddress()+ "端口为" + dp.getPort() + "信息为" +msg );
        }
    }
}
