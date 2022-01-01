import java.io.*;

/**
 * @author: zcl
 * @create: 2022/1/1 8:34
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {

        File file = new File("I:/java/Java_SE_lx/io/src/abc.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int read = 0;
            while((read = bufferedInputStream.read())!=-1){
                bufferedInputStream.skip(5);
                System.out.print((char)read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
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
