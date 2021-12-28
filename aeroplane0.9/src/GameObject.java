import java.awt.*;

/**
 * @author: zcl
 * @create: 2021/12/28 9:54
 * 游戏物体的根类
 */
public class GameObject {
    //图片
    Image img;
    //物体的坐标
    double x,y;
    //物体移动的速度
    int speed;
    //物体的高度和宽度
    int width,height;

    public GameObject(){

    }
    public GameObject(Image img, double x, double y, int speed, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, double x, double y, int speed) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;

        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }

    public void drawMyself(Graphics g){
        g.drawImage(img, (int) x, (int) y,width,height,null);
    }
    /**
     * 返回物体矩形区域,便于后续做操作
     *
     * */
    public Rectangle getRec(){
        return new Rectangle((int) x, (int) y,width,height);
    }

}
