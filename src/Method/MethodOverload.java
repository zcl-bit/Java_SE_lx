package Method;

public class MethodOverload {
    public static int add() {
        return 0;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(double a, double b) {
        return (int) (a + b);
    }

    public static int add(int a,double b){
        return (int) (a + b);
    }
    public static int add(double a,int b){
        return (int) (a + b);
    }
    public static void main(String[] args) {
        add();
        add(3, 4);
        add(3.1, 4.1);
        add(3, 4.1);
        add(3.1, 4);
    }
}
