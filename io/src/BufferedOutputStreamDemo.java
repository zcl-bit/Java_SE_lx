import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: zcl
 * @create: 2022/1/1 8:36
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) {

        File file = new File("I:/java/Java_SE_lx/io/src/123.txt");
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream =null;
        try {
            fileOutputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(10);
            bufferedOutputStream.write("www.baidu.com".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
