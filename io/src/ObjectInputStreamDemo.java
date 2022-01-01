import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author: zcl
 * @create: 2022/1/1 8:59
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {

            fileInputStream = new FileInputStream("I:/java/Java_SE_lx/io/src/abc.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println(objectInputStream.readUTF());
            Object object = objectInputStream.readObject();
            if(object instanceof Person){
                Person p = (Person) object;
                System.out.println(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
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
