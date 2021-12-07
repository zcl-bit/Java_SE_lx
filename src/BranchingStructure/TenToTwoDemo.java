package BranchingStructure;

import java.util.Scanner;

public class TenToTwoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int i = sc.nextInt();
        String num = "";
        while (i > 0){

            int k = i % 2;
            num = k + num;
            i = i / 2;
        }
        System.out.println(num);
    }
}
