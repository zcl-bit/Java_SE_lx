package BranchingStructure;

import javax.net.ssl.SNIHostName;
import java.util.Scanner;

//1,1,2,3,5,8,13,21
public class CycleHomeWorkFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入要打印的斐波那契数列的个数：");

        int number = sc.nextInt();
        int x = 1;
        int y = 1;
        int z = 0;
        for (int i = 1; i <= number; i++) {
            if (i == 1 || i == 2){
                System.out.print(1 + "\t");
            }else {
                z = x + y;
                x = y;
                y = z;
                System.out.print(z + "\t");
            }

        }


    }



}
