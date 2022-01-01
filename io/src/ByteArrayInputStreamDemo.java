import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author: zcl
 * @create: 2022/1/1 8:21
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {

        String str = "zcl";
        byte[] buffer = str.getBytes();
        ByteArrayInputStream byteArrayInputStream = null;
        byteArrayInputStream = new ByteArrayInputStream(buffer);
        int read = 0;
        while((read = byteArrayInputStream.read())!=-1){
            //隔四个字符
            byteArrayInputStream.skip(4);
            System.out.println((char)read);
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
