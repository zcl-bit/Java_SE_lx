import java.io.IOException;
import java.io.PrintStream;

/**
 * @author: zcl
 * @create: 2022/1/1 13:24
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream printStream = null;
        try {
//            printStream = new PrintStream(new FileOutputStream("123.txt"));
            printStream = new PrintStream(System.out);
            printStream.write("hello mashibing".getBytes());
            printStream.println(true);
            System.out.println();
            //格式化输出 %s：字符串  %d:整数  %f:浮点数
            System.out.printf("%s--%d---%.2f","abc",123,111.1111);
            System.err.println("mashibing");
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();
    }
}
