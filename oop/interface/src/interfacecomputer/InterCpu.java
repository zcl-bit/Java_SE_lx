package interfacecomputer;

/**
 * @author: zcl
 * @create: 2021/12/26 15:31
 */
public class InterCpu implements CPU{

    @Override
    public String getBrand() {
        return "inter";
    }
    @Override
    public String getHZ() {
        return "2000";
    }
}
