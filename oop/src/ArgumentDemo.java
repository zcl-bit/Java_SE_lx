/**
 * 方法参数的值是否改变
 *      方法中的参数列表叫做形式参数，没有具体的值，只是为了方便在方法体中使用
 *      调用方法的时候实际传入的值叫做实际参数，代表具体的数值，用来替换在方法体中代码逻辑的值，进行运算
 *      注意：
 *          1、形式参数的变量名称也是局部变量
 *          2、当方法的参数值是基本数据类型的时候，不会改变原来的值
 *          3、方法的参数值是引用类型的时候，如果改变了该引用类型的值，会改变原来对象的值
 *      总结：
 *          Java中的参数传递是值传递
 *
 *
 *
 * */
public class ArgumentDemo {
    public static void test(int a, int b) {
        int tmep = a;
        a = b;
        b = tmep;
    }

    public static void test2(PointDemo pointDemo){
        int x = pointDemo.getX();
        int y = pointDemo.getY();
        int temp = x;
        x = y;
        y = temp;
        pointDemo.setX(x);
        pointDemo.setY(y);
    }

    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        test(a, b);
//        System.out.println(a);
//        System.out.println(b);
        PointDemo pointDemo = new PointDemo(2,3);
        test2(pointDemo);
        System.out.println(pointDemo.getX());
        System.out.println(pointDemo.getY());
    }
}
