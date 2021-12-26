package interfacephone;

/**
 * @author: zcl
 * @create: 2021/12/26 14:55
 */
public class Test {
    public static void main(String[] args) {
        AptitudeHandst aptitudeHandst = new AptitudeHandst("华为","智能");
        aptitudeHandst.networkConn();
        aptitudeHandst.play("大鱼");
        aptitudeHandst.takePicture();
        aptitudeHandst.sendInfo();
        aptitudeHandst.call();
        CommonHandset commonHandset = new CommonHandset("老年机","普通");
        commonHandset.play("大江大河");
        commonHandset.sendInfo();
        commonHandset.call();
    }

}
