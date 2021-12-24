/**
 * static:
 * 修饰成员变量的时候，表示静态成员变量或者叫类变量
 * 普通变量在使用的时候，必须要通过对象名进行调用
 * 类变量或静态变量可以使用对象名调用也可以使用类名进行调用
 * 修饰方法的时候，表示静态方法或者叫类方法
 * 普通方法在使用的时候，必须要通过对象名进行调用
 * 类方法或静态方法可以使用类名，也可以使用对象名
 * 注意：
 * 1、静态变量，在创建对象之前被初始化，或者说在类被载入之前进行初始化
 * 2、静态变量被所有的对象共享，属于公共变量，对象和类都可以直接调用，但是推荐使用类来调用
 * 3、成员变量放在堆中，而静态变量放在方法区中的静态区
 * 4、静态变量不能定义在静态方法中
 * 5、静态方法可以在非静态方法中调用
 * 6、静态方法中不能直接调用非静态方法(new)
 * 7、静态方法中不允许出现this调用
 * 8、一般工具类中的方法定义为static
 */
public class StaticDemo {
    static String name = "张三";
    static int age = 10;

    public static void test() {
//        new StaticDemo().test2();
        System.out.println("static");
    }

    public void test2() {
        test();
    }

    public static void main(String[] args) {

        StaticDemo sd = new StaticDemo();
        test();
        sd.test2();
        StaticDemo.test();
        StaticDemo staticDemo = new StaticDemo();
        //使用对象进行调用
        System.out.println(name);
        System.out.println(age);

        age = 20;
        System.out.println(age);
        System.out.println(StaticDemo.age);

        StaticDemo.age = 30;
        System.out.println(age);
        System.out.println(StaticDemo.age);

        StaticDemo staticDemo1 = new StaticDemo();
        System.out.println(age);


        //使用类名进行调用
//        System.out.println(StaticDemo.name);
//        System.out.println(StaticDemo.age);
    }
}
