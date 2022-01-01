import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author: zcl
 * @create: 2022/1/1 8:26
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        //输出{
        byteArrayOutputStream.write(123);
        try {
            byteArrayOutputStream.write("zcl".getBytes());
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
