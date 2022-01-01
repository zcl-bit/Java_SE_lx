import java.io.*;

/**
 * @author: zcl
 * @create: 2022/1/1 8:46
 */
public class DataDemp {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            //向文件中写入数据流
            fileOutputStream = new FileOutputStream("I:/java/Java_SE_lx/io/src/abc.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
            dataOutputStream.writeShort(344);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeUTF("zcl");
            //从文件读取数据流
            fileInputStream = new FileInputStream("I:/java/Java_SE_lx/io/src/abc.txt");
            dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
