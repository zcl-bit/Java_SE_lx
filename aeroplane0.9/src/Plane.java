import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author: zcl
 * @create: 2021/12/28 10:12
 */
public class Plane extends GameObject{

    //飞机的方向控制
    boolean left, right, up, down;

    boolean live = true;//活着


    @Override
    public void drawMyself(Graphics g){
        if (live){
            super.drawMyself(g);
            if (left) {
                x -= speed;
            }
            if (right){
                x += speed;
            }
            if (up){
                y -= speed;
            }
            if (down){
                y += speed;
            }
        }

        //飞机飞行的算法，可以自行设定
//        x += speed;

    }

    public void addDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
        }
    }
    public void minusDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
        }
    }

    public Plane(Image img, double x, double y, int speed) {
        super(img, x, y, speed);
    }
}
