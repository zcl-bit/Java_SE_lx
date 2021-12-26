package interfacedemo3;

/**
 * @author: zcl
 * @create: 2021/12/26 15:24
 */
public class Printer implements InkBox, Paper {
    @Override
    public void getWriteAndBlock() {
        System.out.println("使用黑白墨盒打印");

    }

    @Override
    public void getColor() {
        System.out.println("使用彩色墨盒打印");
    }

    @Override
    public void getA4() {
        System.out.println("使用A4纸打印");

    }

    @Override
    public void getB5() {
        System.out.println("使用B5纸打印");

    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.getWriteAndBlock();
        printer.getA4();
    }
}
