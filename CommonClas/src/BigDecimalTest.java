import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author: zcl
 * @create: 2021/12/31 10:32
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        /*
            BigDecimal类:
                概述:java.math.BigDecimal表示超大的小数,并且可以解决小数运算的精度问题
                构造方法:
                    BigDecimal(double val) 将double类型的数据封装为BigDecimal对象
                    BigDecimal(String val) 将 BigDecimal 的字符串表示形式转换为 BigDecimal  推荐
                    注意：推荐使用第二种方式，第一种存在精度问题；

                成员方法:
                    public BigDecimal add(BigDecimal value) 加法运算
                    public BigDecimal subtract(BigDecimal value)  减法运算
                    public BigDecimal multiply(BigDecimal value) 乘法运算
                    public BigDecimal divide(BigDecimal value)  除法运算

                注意：对于divide方法来说，如果除不尽的话，
                就会出现java.lang.ArithmeticException异常。此时可以使用divide方法的另一个重载方法；

                BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode):
                                divisor：除数对应的BigDecimal对象；
                                scale:精确的位数；
                                roundingMode取舍模式  RoundingMode枚举: RoundingMode.HALF_UP 四舍五入

         */
        // 加法运算:
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        BigDecimal res1 = b1.add(b2);
        System.out.println("res1:"+res1);// 0.10

        // 减法运算:
        BigDecimal b3 = new BigDecimal("1.0");
        BigDecimal b4 = new BigDecimal("0.32");
        BigDecimal res2 = b3.subtract(b4);
        System.out.println("res2:"+res2);// 0.68

        // 乘法运算
        BigDecimal b5 = new BigDecimal("1.015");
        BigDecimal b6 = new BigDecimal("100");
        BigDecimal res3 = b5.multiply(b6);
        System.out.println("res3:"+res3);// 101.500

        // 除法运算
        BigDecimal b7 = new BigDecimal("1.301");
        BigDecimal b8 = new BigDecimal("100");
        BigDecimal res4 = b7.divide(b8);
        System.out.println("res4:"+res4);// 0.01301

        // 加法运算: 有问题的
        BigDecimal b9 = new BigDecimal(0.09);
        BigDecimal b10 = new BigDecimal(0.01);
        BigDecimal res5 = b9.add(b10);
        System.out.println("res5:"+res5);// res5:0.0999999999999999968774977432417472300585359334945678710937

        // 除法运算: 有问题的
        /*BigDecimal b11 = new BigDecimal("10");
        BigDecimal b12 = new BigDecimal("3");
        BigDecimal res6 = b11.divide(b12);// 报异常
        System.out.println("res6:"+res6);*/

        /*BigDecimal b13 = new BigDecimal("20");
        BigDecimal b14 = new BigDecimal("3");
        BigDecimal res7 = b13.divide(b14);// 报异常
        System.out.println("res7:"+res7);*/

        // 注意：对于divide方法来说，如果除不尽的话，
        // 就会出现java.lang.ArithmeticException异常。此时可以使用divide方法的另一个重载方法；
        BigDecimal b11 = new BigDecimal("10");
        BigDecimal b12 = new BigDecimal("3");
        BigDecimal res6 = b11.divide(b12,2, RoundingMode.HALF_UP);
        System.out.println("res6:"+res6);// 3.33

        BigDecimal b13 = new BigDecimal("20");
        BigDecimal b14 = new BigDecimal("3");
        BigDecimal res7 = b13.divide(b14,3,RoundingMode.HALF_UP);
        System.out.println("res7:"+res7);// 6.667


        // System.out.println(0.09+0.01);// 期望: 0.10     实际:0.09999999999999999
        // System.out.println(1.0 - 0.32);// 期望; 0.68    实际:0.6799999999999999
        // System.out.println(1.015 * 100);// 期望:101.500 实际:101.49999999999999
        // System.out.println(1.301 / 100);// 期望:0.01301 实际:0.013009999999999999
    }
}
