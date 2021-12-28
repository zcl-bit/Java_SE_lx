import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/**
 * @author: zcl
 * @create: 2021/12/28 9:10
 * 游戏工具类
 */
public class GameUtil {
//    构造器私有，防止别人创建本类对象
    private GameUtil(){

    }
    public static Image getImage(String path) {
        Image img = null;
        //加载图片
        URL u = GameUtil.class.getClassLoader().getResource(path);
        try {
            img = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public static void main(String[] args) {
        Image img = GameUtil.getImage("images/plane.png");
        System.out.println(img);
    }
}
