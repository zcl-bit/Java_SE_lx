package interfacedemo2;

/**
 * @author: zcl
 * @create: 2021/12/26 14:21
 */
public class UPan implements Usb{
    @Override
    public void dataTranser() {
        System.out.println("U盘可以传输数据");
    }

    @Override
    public void play() {
        System.out.println("Upan play===");
    }
}
