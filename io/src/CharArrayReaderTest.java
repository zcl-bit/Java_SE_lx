import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author: zcl
 * @create: 2022/1/1 9:52
 */
public class CharArrayReaderTest{
    public static void main(String[] args) {

        char[] chars = "zcl".toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        try {
            int read = 0;
            while((read = charArrayReader.read())!=-1){
                System.out.println((char)read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }

    }
}
