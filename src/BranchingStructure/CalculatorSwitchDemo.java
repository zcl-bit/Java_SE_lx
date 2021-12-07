package BranchingStructure;

import java.util.Scanner;

public class CalculatorSwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要进行运算的数据1");
        int num1 = sc.nextInt();
        System.out.println("请输入要进行运算的数据2");
        int num2 = sc.nextInt();
        System.out.println("请输入要进行的运算方式（+，-，*，/）");
        String symbol1 = sc.next();

        switch (symbol1){
            case "+":
                System.out.println("两个数据的和为："+(num1+num2));
                break;
            case "-":
                System.out.println("两个数据的和为:" +(num1-num2));
                break;
            case "*":
                System.out.println("两个数据的和为:" +(num1*num2));
                break;
            case "/":
                System.out.println("两个数据的和为:" +(num1/num2));
                break;
            default:
                System.out.println("您输入的运算方式错误");
                break;
        }
    }
}
