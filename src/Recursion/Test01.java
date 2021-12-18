package Recursion;
/**
 * 定义递归要有结束的条件
 *
 * */
public class Test01 {
    public static int num = 10;
    public static void a(){
        num--;
        System.out.println("Test01.a" + num);
        if (num > 0){
            a();
        }
    }

    public static void b(){
        System.out.println("Test01.b");
    }

    public static void main(String[] args) {
        a();
    }

}
