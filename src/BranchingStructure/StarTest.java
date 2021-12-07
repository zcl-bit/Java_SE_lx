package BranchingStructure;

import java.util.Scanner;

public class StarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入想要的层数：");
        int totalLevel = sc.nextInt();
        /**
         * 1.打印半个金字塔
         *
         *
         * */
        for (int i = 0; i < totalLevel; i++) {


            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        /**
         * 2.打印整个金字塔
         *
         *
         * */
        for (int i = 1; i <= totalLevel; i++) {  //i表示层数

            //输出*之前，输出对应空格 = 总层数 - 当前层数
            for (int j = 1; j <= totalLevel - i ; j++) {
                System.out.print(" ");
            }

            //控制打印每层*的个数
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

        /**
         *
         * 3.打印空心金字塔
         *
         *
         * */
        for (int i = 1; i <= totalLevel ; i++) {

            for (int j = 1; j <= totalLevel  - i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                //当前行的第一个位置和最后一个位置为*，最后一层全部输出
                if ( j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                }else { //其他情况输出空格
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        /**
         *
         * 4.打印空心菱形
         *
         *
         * */
        for (int i = 1; i <= totalLevel ; i++) {

            for (int j = 1; j <= totalLevel  - i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                //当前行的第一个位置和最后一个位置为*，最后一层全部输出
                if ( j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }else { //其他情况输出空格
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = totalLevel; i >= 1 ; i --) {

            for (int j = 1; j <= totalLevel - i ; j ++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j ++) {

                //当前行的第一个位置和最后一个位置为*，最后一层全部输出
                if ( j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }else { //其他情况输出空格
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
