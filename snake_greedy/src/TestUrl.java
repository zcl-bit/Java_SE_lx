import java.net.URL;

/**
 * @author: zcl
 * @create: 2022/1/5 12:00
 */
public class TestUrl {
    public static void main(String[] args) {
        URL bodyURL = Images.class.getResource("/");
        System.out.println(bodyURL);
    }
}
