package TCPpractice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());
    }
}
