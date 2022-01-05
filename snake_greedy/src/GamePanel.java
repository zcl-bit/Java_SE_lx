import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author: zcl
 * @create: 2022/1/5 12:17
 * 继承了JPanel以后，才具备了面板的功能，才成为面板
 */
public class GamePanel extends JPanel {
    /**
     * 定义两个数组
     * */
    /**
     * 蛇的长度
     */
    int length;
    /**
     * 一个数组，存储蛇的x坐标
     */
    int[] snakeX = new int[400];
    /**
     * 一个数组，存储蛇的y坐标
     */
    int[] snakeY = new int[400];
    /**
     * 游戏只有两个状态，开始，暂停
     */
    boolean isStart = false;
    /**
     * 加入一个定时器
     */
    Timer timer;
    /**
     * 定义蛇的行走方向
     */
    String direction;
    /**
     * 定义食物的x，y坐标
     */
    int foodX;
    int foodY;
    /**
     * 定义一个积分
     * */
    int score;
    /**
     * 加入一个变量，判断小蛇的死亡状态
     * 默认情况下小蛇未死亡
     * */
    boolean isDie = false;
    public void init() {
        //初始化蛇的长度
        length = 3;
        //初始化蛇头坐标
        snakeX[0] = 175;
        snakeY[0] = 275;
        //初始化第一节身子坐标
        snakeX[1] = 150;
        snakeY[1] = 275;
        //初始化第二节身子坐标
        snakeX[2] = 125;
        snakeY[2] = 275;
        //初始化蛇头的方向
        direction = "R";
        //初始化食物的坐标
        foodX = 300;
        foodY = 200;
        //初始化积分
        score = 0;

    }

    //定义构造器
    public GamePanel() {
        init();
        //将焦点定位在当前操作的面板上
        this.setFocusable(true);
        //加入监听
        this.addKeyListener(new KeyAdapter() {
            @Override
            //监听键盘按键的按下操作
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                //监听空格
                if (keyCode == KeyEvent.VK_SPACE) {
                    if (isDie){
                        //全部恢复到初始化状态
                        init();
                        isDie = false;
                    }else {
                        //小蛇没有死亡的前提下
                        isStart = !isStart;
                        //做一个重绘动作
                        repaint();
                    }
                }
                //监听向上箭头
                if (keyCode == KeyEvent.VK_UP) {
                    direction = "U";
                }
                //监听向下箭头
                if (keyCode == KeyEvent.VK_DOWN) {
                    direction = "D";
                }
                //监听向左箭头
                if (keyCode == KeyEvent.VK_LEFT) {
                    direction = "L";
                }
                //监听向右箭头
                if (keyCode == KeyEvent.VK_RIGHT) {
                    direction = "R";
                }

            }
        });
        //对定时器进行初始化动作
        timer = new Timer(100, new ActionListener() {
            /**
             * ActionListener是事件监听
             * 相当于每100毫秒监听一下是否发生了一个动作
             * 具体的动作放入actionPerformed里面
             * */
            @Override
            public void actionPerformed(ActionEvent e) {

                //游戏是开始状态蛇才动
                if (isStart && isDie == false) {
                    //后一截身子走到前一节身子的位置上
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    //动头
                    if ("R".equals(direction)) {

                        snakeX[0] += 25;
                    }
                    if ("L".equals(direction)) {

                        snakeX[0] -= 25;
                    }
                    if ("U".equals(direction)) {

                        snakeY[0] -= 25;
                    }
                    if ("D".equals(direction)) {

                        snakeY[0] += 25;
                    }
                    //防止蛇超出边界
                    //定义右边界
                    int rightBoundary = 750;
                    int leftBoundary = 15;
                    int upBoundary = 70;
                    int downBoundary = 725;
                    if (snakeX[0] > rightBoundary) {
                        snakeX[0] = 15;
                    }
                    if (snakeX[0] < leftBoundary) {
                        snakeX[0] = 750;
                    }
                    if (snakeY[0] < upBoundary) {
                        snakeY[0] = 725;
                    }
                    if (snakeY[0] > downBoundary) {
                        snakeY[0] = 70;
                    }
                    //检测碰撞的动作
                    //食物的坐标和蛇头的坐标一样的时候，才是碰撞了
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        //蛇长度加1
                        length++;
                        //食物坐标改变;随机生成坐标，坐标必须是25的倍数
                        foodX = ((int)(Math.random() * 30) + 1) * 25;//[15,750]
//                        foodY = (new Random().nextInt(26) + 3)*25;
                        foodY = ((int)(Math.random() * 25) + 3) * 25;//[70,725]
                        //吃上食物以后积分加10
                        score += 10;
                    }
                    //死亡判定
                    for (int i = 1; i < length; i++) {
                        if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                            //将死亡状态改为true
                            isDie = true;
                        }
                    }
                    //刷新页面/重构页面
                    repaint();
                }
            }
        });
        //定时器必须要启动
        timer.start();
    }

    /**
     * painComponent这个方法比较特殊，这个方法就属于图形版的main方法
     * 自动调用
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //填充背景颜色
        this.setBackground(new Color(255, 236, 213, 250));
        //画头部图片this指当前面板，g指使用的画笔，xy表示坐标
        Images.headerImg.paintIcon(this, g, 0, 0);
        //调节画笔颜色
        g.setColor(new Color(241, 154, 154, 255));
        //画一个矩形
        g.fillRect(10, 70, 760, 680);

        //画小蛇
        //画蛇头
        if ("R".equals(direction)) {
            Images.rightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        }
        if ("L".equals(direction)) {
            Images.leftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        }
        if ("U".equals(direction)) {
            Images.upImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        }
        if ("D".equals(direction)) {
            Images.downImg.paintIcon(this, g, snakeX[0], snakeY[0]);
        }
/*        //画第一节身子
        Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
        //画第二节身子
        Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);
        */
        //优化为循环画蛇的身子
        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        //如果游戏暂停，界面中应该有一句提示语
        if (isStart == false) {
            //画一个文字
            g.setColor(new Color(135, 81, 192));
            //三个参数：字体，加粗，字号
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            //画文字:三个参数，文字内容，x轴坐标，y轴坐标
            g.drawString("点击空格开始游戏", 250, 330);
        }

        //画食物
        Images.foodImg.paintIcon(this, g, foodX, foodY);
        //画积分
        //画一个文字
        g.setColor(new Color(255, 255, 255));
        //三个参数：字体，加粗，字号
        g.setFont(new Font("微软雅黑", Font.BOLD, 20));
        //画文字:三个参数，文字内容，x轴坐标，y轴坐标
        g.drawString("积分：" + score, 620, 40);

        //画入死亡状态
        if (isDie){
            //画一个文字
            g.setColor(new Color(175, 19, 19));
            //三个参数：字体，加粗，字号
            g.setFont(new Font("微软雅黑", Font.BOLD, 20));
            //画文字:三个参数，文字内容，x轴坐标，y轴坐标
            g.drawString("小蛇死亡，游戏停止，按下空格重新开始游戏", 250, 330);
        }

    }
}
