import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/**
 * @author: zcl
 * @create: 2021/12/28 8:31
 */
public class MyGameFrame extends Frame {

    Image planeImage = GameUtil.getImage("images/plane.png");
    Image blackGround = GameUtil.getImage("images/bg.jpg");


    Plane p1 = new Plane(planeImage, 100, 100, 7);
    //    Shell s1 = new Shell();
    Shell[] shells = new Shell[50];

    //    爆炸
    Explode explode;
    Date start = new Date();//游戏开始的时间
    Date end;//游戏结束的时间
    long period = 0;//玩了多少秒


    //绘制窗口
    @Override
    public void paint(Graphics g) {
        //画背景
        g.drawImage(blackGround, 0, 0, 500, 500, null);
        //画时间
        drawTime(g);
        //画飞机
        p1.drawMyself(g);

        //画炮弹
        for (int i = 0; i < shells.length; i++) {
            shells[i].drawMyself(g);

            //碰撞检测，将所有的炮弹和飞机进行检测，看有没有碰撞
            boolean peng = shells[i].getRec().intersects(p1.getRec());
            if (peng) {
//                System.out.println("飞机被击中了！！");
                p1.live = false;
                //处理爆炸效果
                if (explode == null) {
                    explode = new Explode(p1.x, p1.y);
                }
                explode.drawMySelf(g);

            }


        }


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

    public void drawTime(Graphics g) {
        Color c = g.getColor();
        Font f = g.getFont();
        g.setColor(Color.green);
        if (p1.live) {
            //时间
            period = (System.currentTimeMillis() - start.getTime()) / 1000;
            //显示时间
            g.drawString("坚持：" + period, 30, 50);
        } else {
            if (end == null) {
                end = new Date();
                period = (end.getTime() - start.getTime()) / 1000;
            }
            g.setFont(new Font("微软雅黑", Font.BOLD, 30));
            g.drawString("最终时间：" + period, 200, 200);

        }
        g.setFont(f);
        g.setColor(c);
    }


    //初始化窗口
    public void launchFrame() {
        //设置窗口名称
        this.setTitle("周晨靓的飞机大战");
        //设置窗口可见性
        setVisible(true);
        //设置窗口大小
        setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        //窗口打开的位置
        setLocation(400, 400);
        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //正常退出程序
                System.exit(0);
            }
        });
        new PaintThread().start();//启动重画窗口线程
        //启动键盘监听
        this.addKeyListener(new KeyMonitor());
        //初始化创建炮弹对象
        for (int i = 0; i < shells.length; i++) {
            shells[i] = new Shell();
        }

    }

    /**
     * 定义了一个重画窗口的线程类
     * 定义成内部类是为了方便直接使用窗口类的相关方法
     */

    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
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


    //内部类实现键盘的监听处理
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
//            System.out.println("按下：" + e.getKeyCode());
/*            if (e.getKeyCode() == KeyEvent.VK_LEFT){
                left = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                right = true;
            }*/
            p1.addDirection(e);

        }

        @Override
        public void keyReleased(KeyEvent e) {
//            System.out.println("抬起：" + e.getKeyCode());
            p1.minusDirection(e);
        }
    }


    private Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreenImage == null) {
            offScreenImage = this.createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
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
