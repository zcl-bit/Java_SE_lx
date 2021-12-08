package Recursion;


import java.util.Scanner;

//1,1,2,3,5,8,13,21
public class Fibonacci {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {

            System.out.print(getNumber(i) + "\t");
            
        }


    }

    public static int getNumber(int number){
        if (number == 1 || number == 2){
            return 1;

        }else {
            return getNumber(number - 1)+getNumber(number - 2);
        }
    }



}
