import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author: zcl
 * @create: 2021/12/28 8:31
 */
public class MyGameFrame extends Frame {

    Image plane = GameUtil.getImage("images/plane.png");
    Image blackGround = GameUtil.getImage("images/bg.jpg");

    int planeX = 100;
    //绘制窗口
    @Override
    public void paint(Graphics g) {
        g.drawImage(blackGround,0,0,500,500,null);
        g.drawImage(plane,planeX,100,22,33,null);

        planeX += 1;
        //将颜色默认值进行存储
//        Color c =g.getColor();
////        g.setColor(Color.blue);
//        //设置颜色
//        g.setColor(new Color(255,0,255));
//        //画直线
//        g.drawLine(100,100,400,400);
//        //画矩形
//        g.drawRect(100,100,300,200);
//        //画椭圆
//        g.drawOval(100,100,300,200);
//        //画字符串
//        g.drawString("www.zcl.com",300,300);
//
//        g.setColor(c);

    }

    //初始化窗口
    public void launchFrame(){
        //设置窗口名称
        this.setTitle("周晨靓的飞机大战");
        //设置窗口可见性
        setVisible(true);
        //设置窗口大小
        setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        //窗口打开的位置
        setLocation(400,400);
        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //正常退出程序
                System.exit(0);
            }
        });
        new PaintThread().start();//启动重画窗口线程

    }

    /**
     * 定义了一个重画窗口的线程类
     * 定义成内部类是为了方便直接使用窗口类的相关方法
     *
     *
     * */

    class PaintThread extends Thread{
        @Override
        public void run(){
            while(true){
                //内部类可以直接使用外部类的成员
                repaint();
                try {
                    //程序一秒画20次
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if(offScreenImage == null) {
            offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
        }

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }




    public static void main(String[] args) {
        MyGameFrame myGameFrame = new MyGameFrame();
        myGameFrame.launchFrame();
    }
}
