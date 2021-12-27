/**
 * @author: zcl
 * @create: 2021/12/27 8:36
 *
 * 内部类：
 *      一个Java文件中可以包含多个class。但是只能有一个public class
 *      如果一个类定义在另一个类的内部，此时可以称之为内部类
 *
 *
 */
public class TestInnerClass {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.show();
        System.out.println(innerClass.getName());
        InnerClass.InnerClassDemo innerClassDemo = new InnerClass(). new InnerClassDemo();
        innerClassDemo.test();
//        System.out.println(innerClass.age);
        InnerClass.InnerClassDemo.InnerInner innerInner = new InnerClass().new InnerClassDemo().new InnerInner();


    }
}
