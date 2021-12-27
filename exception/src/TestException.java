import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2021/12/27 10:08
 */
public class TestException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("请输入被除数：");
            int num1 = in.nextInt();
            System.out.println("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
            System.out.println("前面没有出现异常");
/*        }catch (Exception e){
            System.out.println("出现异常");
            //常用
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }*/
/*
        }catch (ArithmeticException e){
            System.out.println("数学异常，除数不能为0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("输入的参数值类型不匹配");
            e.printStackTrace();*/
        }catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }
        System.out.println("感谢使用本程序!");
    }
}
