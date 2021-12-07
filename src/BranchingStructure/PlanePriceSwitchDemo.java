package BranchingStructure;

import java.util.Scanner;

public class PlanePriceSwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入舱位(1为头等舱，2为经济舱)");
        int shippingSpace = sc.nextInt();
        switch (month){
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if(shippingSpace==1){
                    System.out.println("机票价格为："+(5000*0.9));
                }else if (shippingSpace==2){
                    System.out.println("机票价格为："+(5000*0.8));
                }else{
                    System.out.println("输入舱位数据错误");
                }
                break;
            case 1:
            case 2:
            case 3:
            case 11:
            case 12:
                if(shippingSpace==1){
                    System.out.println("机票价格为："+(5000*0.5));
                }else if (shippingSpace==2){
                    System.out.println("机票价格为："+(5000*0.4));
                }else{
                    System.out.println("输入舱位数据错误");
                }
                break;
            default:
                System.out.println("输入月份错误");
        }
    }
}
