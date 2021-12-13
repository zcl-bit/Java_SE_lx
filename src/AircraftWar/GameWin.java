package AircraftWar;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {
    //游戏状态      0未开始       1游戏中     2暂停     3通关失败       4通关成功
    static  int state = 0;



    public void launch(){
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口大小
        this.setSize(600,600);
        //设置窗口位置
        this.setLocationRelativeTo(null);
        //设置窗口标题
        this.setTitle("周晨靓飞机大战");


    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(GameUtils.bgImg,0,0,null);
    }



    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }

}
