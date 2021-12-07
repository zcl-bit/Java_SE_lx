package BranchingStructure;

import java.util.Scanner;

public class FiveScoreAverageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        for (int i = 1;i<=5;i++){
            System.out.println("请输入第" + i + "门课的成绩：");
            int score = sc.nextInt();
            if (score < 0){
                System.out.println("抱歉，分数录入错误，请重新输入");
                break;
            }else {
                sum += score;
            }

            System.out.println(name + "的平均分是：" + sum/5);

        }

    }
}
