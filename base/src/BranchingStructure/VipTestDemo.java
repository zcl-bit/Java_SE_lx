package BranchingStructure;

import java.util.Scanner;

public class VipTestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i<3;i++){
            System.out.print("请输入会员号（4位整数）：");
            int vipNumber = sc.nextInt();
            System.out.print("请输入会员生日（月/日<用两位整数表示>)：");
            String vipBirthday = sc.next();
            System.out.print("请输入会员积分：");
            int vipIntegral = sc.nextInt();
            if (vipNumber<1000 || vipNumber>9999){
                System.out.println("客户号" + vipNumber + "是无效会员号");
                System.out.println("录入信息失败");
                continue;
            }else {
                System.out.println("您录入的会员信息是：" + "\n"
                        + vipNumber + "\t" + vipBirthday + "\t" + vipIntegral);
            }
        }

        System.out.println("程序结束");

    }
}
