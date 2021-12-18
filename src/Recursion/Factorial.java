package Recursion;

public class Factorial {
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n",10 , factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.println("递归费时：" + (d2 - d1));
        long d3 = System.currentTimeMillis();
        int a = 10;
        int result = 1;
        while(a > 1){
            result = result * a * (a - 1);
            a -= 2;
        }
        System.out.println(result);
        long d4 = System.currentTimeMillis();
        System.out.println("循环递归费时：" + (d4-d3));
    }

    static long factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }

}
