package BranchingStructure;

import java.util.Scanner;

//个税计算器
public class PersonalIncomeTax {
    public static void main(String[] args) {
        //2. 个税计算器：
//(1)	通过键盘输入用户的月薪
//(2)	百度搜索个税计算的方式，计算出应缴纳的税款
//(3)	直到键盘输入“exit”，则退出程序（使用break退出循环）
        /*
        应纳税所得额=工资收入金额－各项社会保险费－起征点(5000元)
        应纳税额=应纳税所得额x税率－速算扣除数
        级数	应纳税所得额	                税率(%)	        速算扣除数
        1	    不超过3,000元的部分	           3	            0
        2	    超过3,000元至12,000元的部分	  10	           210
        3	    超过12,000元至25,000元的部分	  20	          1410
        4	    超过25,000元至35,000元的部分	  25	          2660
        5	    超过35,000元至55,000元的部分	  30	          4410
        6	    超过55,000元至80,000元的部分	  35	          7160
        7	    超过80,000元的部分	          45	          15160
         */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入月薪：");
            double slary = scanner.nextInt();//月薪
            double jiao = slary-5000;//应纳税所得额（各项社会保险费=0）
            double shui = 0;//应纳税额
            if (jiao<0){
                System.out.println("个税起征点为5000元，不需要纳税");
            }else if(jiao<=3000){
                shui=jiao*0.03;
                slary-=shui;

            }else if (jiao<=12000){
                shui=jiao*0.1-210;
                slary-=shui;
            }else if (jiao<=25000){
                shui=jiao*0.2-1410;
                slary-=shui;
            }else if (jiao<=35000){
                shui=jiao*0.25-2660;
                slary-=shui;
            }else if (jiao<=55000){
                shui=jiao*0.3-4410;
                slary-=shui;
            }else if (jiao<=80000){
                shui=jiao*0.35-7160;
                slary-=shui;
            }else {
                shui=jiao*0.45-15160;
                slary-=shui;
            }
            System.out.println("应纳税所得额："+jiao+"元\t"+"纳税税额"+shui+"元\t"+"实发工资"+slary+"元");
            System.out.println("输入exit退出程序！其他继续计算！");
            String cmd =scanner.next();
            if("exit".equals(cmd)){
                System.out.println("程序结束，退出！");
                break;
            }else{
                continue;
            }


        }
    }
}
