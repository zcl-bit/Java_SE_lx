import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: zcl
 * @create: 2022/1/1 7:25
 */
public class BufferedReaderTest {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("I:/java/Java_SE_lx/io/src/aaa.txt"));
            String read = null;
            while((read = reader.readLine())!=null){
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
