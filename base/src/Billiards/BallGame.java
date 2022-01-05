package Billiards;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");

    double x = 200;
    double y = 200;

    double degree = 3.14/3;//弧度 3.14=180°   60°

//    boolean right = true;//控制小球水平位移的方向

    //绘制窗口
    @Override
    public void paint(Graphics g){
        System.out.println("窗口被画了一次");
        g.drawImage(desk,0,0,null);
        //小球以左上角为轴的位置
        g.drawImage(ball,(int)x,(int)y,null);

        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        //碰到上下边界
        if (y>501-40-30 || y<40+40){
            degree = -degree;

        }

        //碰到左右边界
        if (x>856-40-30 || x<40+40){
            degree = 3.14 - degree;
        }

//        if (right) {
//
//            x += 10;
//        }else{
//            x -= 10;
//        }
//        if (x>786){  //856-30-40
//            right = false;
//        }
//        if (x<40){
//            right = true;
//        }
    }

    //创建窗口
    void launchFrame(){
        //指定宽和高
        setSize(856,501);
        //指定在桌面哪个位置弹出（以桌面左上角为轴）
        setLocation(100,100);

        setVisible(true);

        //实现动画，每秒绘制窗口25次
        while (true){
            repaint();

            try {
                //1s = 1000ms 大约1秒绘制1000/40=25次
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("开始游戏");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
