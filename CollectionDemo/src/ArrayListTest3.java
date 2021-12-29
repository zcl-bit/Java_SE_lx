import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2021/12/29 15:48
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        /**
         * 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合（学生的姓名和年龄来自于键盘输入）
         *
         *
         * */
        method();
    }

    //抽取代码到方法中：Ctrl+Alt+m
    private static void method() {
        //1、创建Arraylist集合，限制集合中元素的类型为Student类型
        ArrayList<ArrayListTest3Student> list = new ArrayList<ArrayListTest3Student>();
        //2、键盘录入姓名和年龄,创建3个学生对象,并添加到集合中
        Scanner sc = new Scanner(System.in);
        addStudent(list, sc);
        //3、循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            //4、在循环中，获取循环元素，打印输出
            ArrayListTest3Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }

    //定义一个方法，实现键盘录入学生姓名和年龄，创建三个学生对象，并添加到集合中
    private static void addStudent(ArrayList<ArrayListTest3Student> list, Scanner sc) {
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            ArrayListTest3Student stu = new ArrayListTest3Student(name,age);
            list.add(stu);
        }
    }


}
