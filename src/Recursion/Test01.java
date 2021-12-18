package Recursion;

public class Test01 {
    public static void a(){
        System.out.println("Test01.a");
        a();
    }

    public static void b(){
        System.out.println("Test01.a");

    }

    public static void main(String[] args) {
        a();
    }

}
