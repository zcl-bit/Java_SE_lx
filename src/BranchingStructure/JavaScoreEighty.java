package BranchingStructure;
/*
* 循环录入Java课的学生成绩，统计分数大于80分的学生的个数及比例
*
*
* */

import java.util.Scanner;

public class JavaScoreEighty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入班级总人数：");
        int peopleNumber = sc.nextInt();
        int eightyPeopleNumber = 0;
        for (int i = 1;i<=peopleNumber;i++){
            System.out.println("请输入第" + i + "位学生的成绩:");
            int score = sc.nextInt();
            if (score>=80){
                eightyPeopleNumber++;
            }else {
                continue;
            }


        }
        System.out.println("80分以上的学生人数是："+eightyPeopleNumber);
        System.out.println("80分以上的学生人数所占比例是："+(eightyPeopleNumber/(double)(peopleNumber))*100+"%");
    }
}
