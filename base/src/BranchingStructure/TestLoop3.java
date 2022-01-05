package BranchingStructure;

import java.util.Scanner;

/**
 * 薪水计算器
 *
 * */
public class TestLoop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("我的年薪计算器小软件");
        System.out.println("========exit退出程序；next计算下一个年薪；===========");
        while(true){
            System.out.print("请输入月薪：");
            int monthSalary = sc.nextInt();
            System.out.print("请输入每年发放几月薪水：");
            int months = sc.nextInt();
            int yearSalary = monthSalary * months;

            System.out.println("请输入命令（exit，next，其他任意字符表示继续执行）");
            String command = sc.next();
            System.out.println(command + "=============");

            if ("exit".equals(command)){
                System.out.println("退出软件");
                break;
            }else if ("next".equals(command)){
                System.out.println("计算下一个年薪");

                continue;

            }
            if (yearSalary > 200000){
                System.out.println("您的薪水为：" + yearSalary);
                System.out.println("恭喜您超越98%的国人");
            }else if(yearSalary > 100000){
                System.out.println("您的薪水为：" + yearSalary);
                System.out.println("恭喜您超越90%的国人");
            }

        }

    }
}
