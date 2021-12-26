package interfacephone;

/**
 * @author: zcl
 * @create: 2021/12/26 14:52
 */
public class CommonHandset extends Handset implements PlayWiring{
    @Override
    public void play(String incontent) {
        System.out.println("普通手机播放音乐");
    }

    @Override
    public void sendInfo() {
        System.out.println("普通手机发送短信");
    }

    @Override
    public void call() {
        System.out.println("普通手机打电话");
    }

    @Override
    public void info() {
        System.out.println("普通手机接收短信");
    }

    public CommonHandset() {
    }

    public CommonHandset(String brand, String type) {
        super(brand, type);
    }
}
