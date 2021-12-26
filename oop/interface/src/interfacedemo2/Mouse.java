package interfacedemo2;

/**
 * @author: zcl
 * @create: 2021/12/26 14:21
 */
public class Mouse implements Usb{
    @Override
    public void dataTranser() {
        System.out.println("鼠标来点击屏幕");
    }

    @Override
    public void play() {
        System.out.println("play=====");
    }

}
