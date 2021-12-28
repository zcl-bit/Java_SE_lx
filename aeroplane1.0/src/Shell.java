import java.awt.*;

/**
 * @author: zcl
 * @create: 2021/12/28 10:46
 * <p>
 * 炮弹类
 */
public class Shell extends GameObject {
    double degree;//角度，炮弹沿着指定的角度飞行

    public Shell() {
        x = 200;
        y = 200;
        degree = Math.random() * Math.PI * 2;

        width = 10;
        height = 10;
        speed = 7;
    }

    @Override
    public void drawMyself(Graphics g) {
//        super.drawMyself(g);
        Color c = g.getColor();
        g.setColor(Color.yellow);
        g.fillOval((int) x, (int) y, width, height);
        g.setColor(c);
        //根据自己算法指定移动的路径
        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);
        //碰到边界改变方向
        if (y > Constant.GAME_HEIGHT - this.height || y < 40) {
            degree = -degree;
        }
        if (x < 0 || x > Constant.GAME_WIDTH - this.width) {
            degree = Math.PI - degree;
        }
    }
}
