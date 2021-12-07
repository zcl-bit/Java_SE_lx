package BranchingStructure;

import java.util.Scanner;

public class WhileShoppingDemoTest{

    public static void main(String []args){

        Scanner input=new Scanner(System.in);

        int bh;//商品编号

        double tt=0.0;//商品单价

        int amount=0;//购买数量

        double dj=0.0;//商品价格

        String name="";//商品名称

        double total=0.0;//商品总价

        double payment=0.0;//应付金额

        double discount=0.8;//折扣比例

        System.out.println("******************************************************");

        System.out.println("请选择购买的商品编号：\n1.T恤\t2.网球鞋\t3.网球拍");

        System.out.println("******************************************************\n");

        String awe="y";  //标识是否继续

        while("y".equals(awe)){

            System.out.println("请输入商品的编号");

            bh=input.nextInt();

            switch(bh){

                case 1:

                    name="T恤250";

                    tt=250;

                    break;

                case 2:

                    name="网球鞋570";

                    tt=570;

                    break;

                case 3:

                    name="网球拍670";

                    tt=670;

                    break;

                default:

                    System.out.println("找不到此商品，请输入正确编号：1-3范围内，按y继续操作");

            }

            if(bh==1||bh==2||bh==3){

                System.out.println("请输入商品的数量");

                amount=input.nextInt();

                dj=tt*amount;

                System.out.println(name+"\t\t"+"数量"+amount+"\t\t"+"合计"+dj);

                total=total+dj;

            }

            System.out.println("是否要继续（y/n）");

            awe=input.next();

        }

        payment=discount*total;//应付金额=商品总价*折扣

        System.out.println("折扣："+discount+"\n"+"应付金额："+payment);

        int sf=0;

        String yy="y";

        while("y".equals(yy)){

            //判断应付金额是否为0，不为0才能输入应收金额

            if(payment!=0){

                System.out.println("实收金额:");

                sf=input.nextInt();

                //判断实付金额是否大于应收金额

                if(sf>payment){

                    double zl=sf-payment;//找零=实收-应收

                    System.out.println("找钱:"+zl);

                }else{

                    System.out.println("实收金额必须大于应收金额");

                }

                System.out.println("按y键返回修改，n键确认结束:");

                yy=input.next();

            }

        }

        System.out.println("谢谢！");

    }

}