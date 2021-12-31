/**
 * @author: zcl
 * @create: 2021/12/31 15:51
 */

import java.io.*;

/**
        * 将abc.txt中的数据写入到aaa.txt中
        * 文件复制的过程
        *
        *
        */
public class OutputStreamDemo {
    public static void main(String[] args) {

        File file = new File("I:/java/Java_SE_lx/io/src/aa.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(99);
            outputStream.write("\r\nmashibing".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}