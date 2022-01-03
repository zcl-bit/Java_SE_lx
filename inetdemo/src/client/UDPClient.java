package client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/1/3 9:57
 */
public class UDPClient {
    public static void main(String[] args) throws Exception {
        //创建udp通信的socket
        DatagramSocket datagramSocket = new DatagramSocket(10000);
        //从控制台读取数据
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("localhost"),10001);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
