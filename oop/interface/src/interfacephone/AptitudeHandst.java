package interfacephone;

/**
 * @author: zcl
 * @create: 2021/12/26 14:52
 */
public class AptitudeHandst extends Handset implements TheakePictures,Network,PlayWiring{

    @Override
    public void networkConn() {
        System.out.println("上网");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void sendInfo() {
        System.out.println("智能手机发短信");
    }

    @Override
    public void call() {
        System.out.println("智能手机打电话");
    }

    @Override
    public void info() {
        System.out.println("智能手机接收短信");
    }

    public AptitudeHandst() {
    }

    public AptitudeHandst(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void play(String incontent) {
        System.out.println("智能手机播放视频");
    }
}
