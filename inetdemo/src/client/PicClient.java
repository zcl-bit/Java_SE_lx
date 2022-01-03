package client;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: zcl
 * @create: 2022/1/3 9:14
 */
public class PicClient {
    public static void main(String[] args) throws Exception {
        //创建图片的输入流对象
        FileInputStream fileInputStream = new FileInputStream("/I:/java/Java_SE_lx/inetdemo/src/img.jpg");
        //创建Socket
        Socket client=  new Socket("localhost",10086);
        //获取输出流对象
        OutputStream outputStream = client.getOutputStream();
        int temp = 0;
        while((temp = fileInputStream.read())!=-1){
            outputStream.write(temp);
        }
        client.shutdownOutput();
        //接受服务端的响应
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println(new String(buf,0,length));
        client.shutdownInput();
        //关闭操作
        inputStream.close();
        outputStream.close();
        fileInputStream.close();
        client.close();
    }
}

