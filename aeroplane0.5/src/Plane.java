import java.awt.*;

/**
 * @author: zcl
 * @create: 2021/12/28 10:12
 */
public class Plane extends GameObject{
    @Override
    public void drawMyself(Graphics g){
        super.drawMyself(g);
        //飞机飞行的算法，可以自行设定
        x += speed;

    }

    public Plane(Image img, double x, double y, int speed) {
        super(img, x, y, speed);
    }
}
