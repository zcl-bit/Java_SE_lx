import java.math.BigInteger;

/**
 * @author: zcl
 * @create: 2021/12/31 10:32
 */
public class BigIntegerTest {
        public static void main(String[] args) {
        /*
            BigInteger类:
                概述: java.math.BigInteger类表示一个超大的整数
                构造方法:
                    public BigInteger(String value) 将 BigInteger 的十进制字符串表示形式转换为 BigInteger。
                成员方法:
                    add(BigInteger value) 返回其值为 (this + val) 的 BigInteger，超大整数加法运算
                    subtract(BigInteger value) 返回其值为 (this - val) 的 BigInteger，超大整数减法运算
                    multiply(BigInteger value)返回其值为 (this * val) 的 BigInteger，超大整数乘法运算
                    divide(BigInteger value) 返回其值为 (this / val) 的 BigInteger，超大整数除法运算，除不尽取整数部分

         */
            // 创建BigInteger对象
            BigInteger b1 = new BigInteger("230000000000000000000000000000000000000000");
            BigInteger b2 = new BigInteger("100000000000000000000000000000000000000000");

            // b1 + b2
            BigInteger res1 = b1.add(b2);
            System.out.println(res1);// 330000000000000000000000000000000000000000

            // b1 - b2
            BigInteger res2 = b1.subtract(b2);
            System.out.println(res2);// 130000000000000000000000000000000000000000

            // b1 * b2
            BigInteger res3 = b1.multiply(b2);
            System.out.println(res3);// 23000000000000000000000000000000000000000000000000000000000000000000000000000000000

            // b1 / b2
            BigInteger res4 = b1.divide(b2);
            System.out.println(res4);// 2


            // 整数
            //int num1 = 2100000000;
            //int num2 = 2300000000;// 编译报错,因为2300000000超过了int类型表示的数据范围
            //long numL1 = 2300000000L;
            //long numL2 = 23000000002300000000L;// 编译报错,因为23000000002300000000L超过了long类型表示的数据范围
        }
    }
