import javax.swing.*;
import java.awt.*;

/**
 * @author: zcl
 * @create: 2022/1/6 8:17
 */
public class TankJframe extends JFrame {
    public TankJframe(){
        //窗口标题
        setTitle("zcl的小游戏坦克大战");
        //设置窗体弹出位置以及大小
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        setBounds((width-800)/2,(height-800)/2,800,800);
        //设置窗体大小不可调节
        setResizable(false);
        //关闭窗口的同时，程序随之关闭
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        //创建面板
//        GamePanel gp = new GamePanel();
//        //将面板放入窗体中
//        jf.add(gp);
        //默认情况下窗体时隐藏，必须进行显现,这个显现方法最好放到最后
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(200,200,50,50);
    }
}
