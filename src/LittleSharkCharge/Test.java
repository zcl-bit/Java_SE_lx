package LittleSharkCharge;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //定义一个字符串，用来接收整个收支的明细
        String details = "";
        //定义一个变量，接收余额
        int balance = 0;
        while (true) {
            System.out.println("-----欢迎使用小鲨鱼记账系统-----");
            System.out.println("1、收支明细");
            System.out.println("2、登记收入");
            System.out.println("3、登记支出");
            System.out.println("4、退   出");
            System.out.println("请输入你要选择的功能：");
            //拿来一个扫描器
            Scanner sc = new Scanner(System.in);
            //接收键盘录入的int类型的数据
            int features = sc.nextInt();
            //对录入的数据进行一个过滤
            while (features != 1 && features != 2 && features != 3 && features != 4) {
                System.out.println("对不起，没有你要选择的功能，请重新输入");
                int newFeatures = sc.nextInt();
                features = newFeatures;
            }
            //根据录入的数字，判断执行相应的功能
            switch (features) {
                case 1:
                    System.out.println("记账系统》》》》收支明细");
                    //System.out.print(details);
                    if (details != ""){
                        System.out.println(details.substring(0,details.length()-1));
                    }else {
                        System.out.print(details);
                    }
                    break;
                case 2:
                    System.out.println("记账系统》》》》登记收入");
                    System.out.println("请录入收入金额：");
                    int income = sc.nextInt();
                    System.out.println("请录入收入说明：");
                    String incomeDetail = sc.next();
                    balance += income;
                    details = details + "收入：" + income + "，收入说明：" + incomeDetail +
                            ",账户余额：" + balance + "\n";
                    break;
                case 3:
                    System.out.println("记账系统》》》》登记支出");
                    System.out.println("请录入支出金额：");
                    int expend = sc.nextInt();
                    System.out.println("请录入支出说明：");
                    String expendDetail = sc.next();
                    balance -= expend;
                    details = details + "支出：" + expend + "，收入说明：" + expendDetail +
                            ",账户余额：" + balance + "\n";
                    break;
                case 4:
                    System.out.println("记账系统》》》》退出功能");
                    System.out.println("确定要退出吗？y/n：");
                    String isExit = sc.next();
                    switch (isExit){
                        case "Y":
                        case "y":
                            System.out.println("系统退出，欢迎您下次继续使用！");
                            return;
                    }
                    return;
            }
        }
    }
}