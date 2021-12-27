package exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2021/12/27 14:08
 */
public class ExerciseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入课程编号");
        try{
            int i = scanner.nextInt();
            if (i == 0){
                System.out.println("Java");
            }else if (i == 1){
                System.out.println("scala");
            }else {
                System.out.println("python");
            }
        }catch (InputMismatchException e){
            e.printStackTrace();
        }finally {

            System.out.println("欢迎选课");
        }

    }
}
