package BranchingStructure;

import java.util.Scanner;

public class ForAgeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double thirtyCountDown = 0;
        double thirtyCountUp = 0;
        for (int i = 1;i <= 10;i++){
            System.out.print("请输入第" + i + "位顾客的年龄：");
            int age = sc.nextInt();
            if (age <= 30){
                thirtyCountDown ++;
            }else  if (age > 30){
                thirtyCountUp ++;
            }
        }
        System.out.println("30岁以下人的比例是：" + (thirtyCountDown/10)*100 + "%");
        System.out.println("30岁以上人的比例是：" + (thirtyCountUp/10)*100 + "%");
    }
}
