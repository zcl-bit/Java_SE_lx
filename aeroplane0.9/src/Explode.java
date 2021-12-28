import java.awt.*;

/**
 * @author: zcl
 * @create: 2021/12/28 11:12
 * 爆炸类
 */
public class Explode {
    //位置
    double x,y;
    static Image[] imgs = new Image[16];
    int count;
    static {
        for (int i = 0; i < 16; i++) {
            imgs[i] = GameUtil.getImage("images/e" + (i + 1) + ".gif");
            //解决懒加载问题,目前没问题加或不加都可以
            imgs[i].getWidth(null);
        }
    }

    public void drawMySelf(Graphics g){
        if (count < 16){
            g.drawImage(imgs[count],(int)x,(int)y,null);
            count++;
        }

    }
    public Explode(){

    }

    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
