package interfacecomputer;

/**
 * @author: zcl
 * @create: 2021/12/26 15:35
 */
public class AmdCpu implements CPU{
    @Override
    public String getBrand() {
        return "amd";
    }

    @Override
    public String getHZ() {
        return "1000";
    }
}
