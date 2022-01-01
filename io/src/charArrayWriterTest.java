import java.io.CharArrayWriter;

/**
 * @author: zcl
 * @create: 2022/1/1 9:59
 */
public class CharArrayWriterTest {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        //a的acsii值
        charArrayWriter.write(97);
        //b的acsii值
        charArrayWriter.write(98);
        //c的acsii值
        charArrayWriter.write(99);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}
