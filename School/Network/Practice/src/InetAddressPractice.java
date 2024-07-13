import java.net.*;
import java.io.*;

public class InetAddressPractice {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getByName("prabeshgupta.com.np");
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());

        byte[] addr = { 72, 5, 3, 66 };
        InetAddress site = InetAddress.getByAddress(addr);
        System.out.println(site);
    }
}
