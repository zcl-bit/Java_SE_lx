import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author: zcl
 * @create: 2021/12/28 8:31
 */
public class MyGameFrame extends Frame {
    //初始化窗口
    public void launchFrame(){
        //设置窗口名称
        this.setTitle("周晨靓的飞机大战");
        //设置窗口可见性
        setVisible(true);
        //设置窗口大小
        setSize(500,500);
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

    }

    public static void main(String[] args) {
        MyGameFrame myGameFrame = new MyGameFrame();
        myGameFrame.launchFrame();
    }
}
