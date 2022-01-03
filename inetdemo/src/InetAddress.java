import java.net.UnknownHostException;

/**
 * @author: zcl
 * @create: 2022/1/3 8:18
 */
public class InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        java.net.InetAddress localHost = java.net.InetAddress.getLocalHost();
        System.out.println(localHost);
        java.net.InetAddress inetAdd = java.net.InetAddress.getByName("www.baidu.com");
        System.out.println(inetAdd);
        System.out.println(inetAdd.getHostAddress());
        System.out.println(inetAdd.getHostName());
    }
}
