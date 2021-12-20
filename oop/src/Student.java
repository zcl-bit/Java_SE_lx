/*
 *
 * 对象的创建和使用
 * 1、使用new关键字来创建对象
 * className classname = new className();
 * 2、对象的使用
 * classname.属性名
 * classname.方法名()
 *
 *
 * */

public class Student {
    int stuNumber;
    String name;
    int age = 20;

    void study() {
        System.out.println("我正在学习");
    }

    void eat(String food) {
        System.out.println("我在吃" + food);
    }

    public static void main(String[] args) {
        //创建对象
        Student student = new Student();
        //使用属性
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);
        //修改属性值，并给属性赋值
        student.name = "张三";
        student.age = 40;
        student.stuNumber = 201908;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);
        //调用方法
        student.study();
        student.eat("apple");
    }
}
