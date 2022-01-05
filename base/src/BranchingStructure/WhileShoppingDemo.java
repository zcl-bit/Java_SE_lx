package BranchingStructure;

import java.util.Scanner;

public class WhileShoppingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.T恤" + '\t' + "2.网球鞋" + '\t' + "3.网球拍");
        System.out.println("**********************************");
        int count = 0;
        String cont = "y";

        while("y" . equals(cont)){
            System.out.print("请输入商品编号：");
            int number = sc.nextInt();
            System.out.print("请输入购买数量：");
            int quality = sc.nextInt();

            if (number == 1){
                count = quality * 245;
                System.out.println("T恤￥245.0" + '\t' + "数量" + "\t" + quality + "\t" + "合计" + "\t" + count);
            }else if (number == 2){
                count = quality * 570;
                System.out.println("网球鞋￥570.0" + '\t' + "数量" + "\t" + quality + "\t" + "合计" + "\t" + count);
            } else if (number == 3) {
                count = quality * 320;
                System.out.println("网球拍￥320.0" + '\t' + "数量" + "\t" + quality + "\t" + "合计" + "\t" + count);
            }
            System.out.print("是否继续（y/n）");
            cont = sc.next();



        }




        System.out.println("折扣：0.0");
        System.out.println("应付金额：" + count);
        System.out.println("实付金额：");
        int price = sc.nextInt();
        while(price < count){
            System.out.println("您输入的金额小于应付金额请重新输入");
            price = sc.nextInt();
        }
        System.out.println("找钱：" + (price - count));
    }
}
