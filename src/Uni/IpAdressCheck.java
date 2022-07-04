package Uni;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class IpAdressCheck {
    public class IPAddress {

        public static boolean isIPv4(String ipAddress) {
            boolean isIPv4 = false;

            if (ipAddress != null) {
                try {
                    InetAddress inetAddress = InetAddress.getByName(ipAddress);
                    isIPv4 = (inetAddress instanceof Inet4Address) && inetAddress.getHostAddress().equals(ipAddress);
                } catch (UnknownHostException ex) {
               }
            }

            return isIPv4;
        }

        public static boolean isIPv6(String ipAddress) {
            boolean isIPv6 = false;

           if (ipAddress != null) {
                try {
                    InetAddress inetAddress = InetAddress.getByName(ipAddress);
                    isIPv6 = (inetAddress instanceof Inet6Address);
                } catch (UnknownHostException ex) {
                }
            }

            return isIPv6;
        }
    }
    public static void main(String[] args) {
        //String ipAddress = "3001:0da8:75a3:0000:0000:8a2e:0370:7334";
        String ipAddress = "42.197.20.45";

        if (IPAddress.isIPv4(ipAddress)) {
            System.out.println("This is IPv4");
        } else if (IPAddress.isIPv6(ipAddress)) {
            System.out.println("This is IPv6");
        } else {
            System.out.println("Invalid IP address");
        }
    }
}
