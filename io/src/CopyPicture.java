import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: zcl
 * @create: 2022/1/1 7:46
 */
public class CopyPicture {
    public static void main(String[] args) {

       /* FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("1.jpg");
            writer = new FileWriter("I:/java/Java_SE_lx/io/src/2.jpg");

            int length = 0;
            char[] chars = new char[1024];
            while((length = reader.read(chars))!=-1){
                writer.write(chars);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("I:/java/Java_SE_lx/io/src/1.jpg");
            fileOutputStream = new FileOutputStream("I:/java/Java_SE_lx/io/src/3.jpg");

            int length = 0;
            byte[] buffer = new byte[1024];
            while((length = fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
