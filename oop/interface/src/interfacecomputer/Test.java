package interfacecomputer;

/**
 * @author: zcl
 * @create: 2021/12/26 15:29
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CPU cpu = new InterCpu();
        HardDisk hardDisk = new JSDHardDisk();
        computer.show(cpu,hardDisk);

    }
}
