/**
 * this：表示当前对象的指针
 * 指向当前对象，表示当前对象的引用
 * 用处：
 * 构造方法，当构造方法中的参数名称跟类的成员变量名称一样的时候，可以使用this代表当前对象
 * 注意：有了this之后，可以将构造方法的参数跟成员变量保持一致
 * 普通方法：
 * 当多个普通方法之间需要调用的时候，可以使用this来进行调用，指的是当前对象的其他方法
 * 成员变量的使用：
 * 当方法中的参数名称跟成员变量保持一致的时候，使用this。变量名称表示的是对象的值，
 * 而使用变量名称表示形参列表中的值
 */


public class ThisDemo {
    String name;
    int age;

    public ThisDemo(){

    }
    public ThisDemo(String name){
        System.out.println("one");
        this.name = name;
    }
    public ThisDemo(String name, int age) {
        //this(name);
        System.out.println("two");
        this.name = name;
        this.age = age;
    }

    public void test1() {
        System.out.println("test1");
    }

    public void test2(String name) {
        System.out.println("test2");
        test1();
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo("张三", 12);
        System.out.println(td.age);
        System.out.println(td.name);
        td.test2("李四");
    }
}
