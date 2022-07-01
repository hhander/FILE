package InetAdressDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception {
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println(ia);
        System.out.println(ia.getHostName());
        InetAddress ia2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ia2.getHostName());
        System.out.println(ia2.getHostAddress());
        System.out.println(ia2.isReachable(5000));

        byte[] b = "我是小韭菜".getBytes();
        DatagramSocket ds = new DatagramSocket();
        /**
         * public DatagramPacket(byte buf[], int offset, int length, SocketAddress address) {
         *         setData(buf, offset, length);
         */
        DatagramPacket pack = new DatagramPacket(b,b.length,InetAddress.getLocalHost(),55555);
        ds.send(pack);

        ds.close();
    }
}
