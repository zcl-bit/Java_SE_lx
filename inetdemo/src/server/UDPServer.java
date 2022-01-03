package server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author: zcl
 * @create: 2022/1/3 9:57
 */
public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(10001);
        byte[] buf = new byte[1024];
        //用来接受传输过来的数据
        DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
        //利用创建好的数据报包对象来接受数据
        datagramSocket.receive(datagramPacket);
        //打印输出信息
        System.out.println( new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        datagramSocket.close();
    }
}
