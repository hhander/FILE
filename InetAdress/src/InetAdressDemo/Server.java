package InetAdressDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket dss = new DatagramSocket(55555);
        byte[] b = new byte[1024*64];
        DatagramPacket dpp = new DatagramPacket(b,b.length);
        dss.receive(dpp);
        System.out.println(new String(b,0, dpp.getLength()));


        dss.close();
    }
}
