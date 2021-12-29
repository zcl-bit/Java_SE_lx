import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2021/12/29 15:35
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        /**
         * 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
         * */
        //1、创建Arraylist集合，限制集合中元素的类型为Student类型
        ArrayList<ArrayListTest2Student> list = new ArrayList<ArrayListTest2Student>();
        //2、创建3个学生对象
        ArrayListTest2Student stu1 = new ArrayListTest2Student("张三",18);
        ArrayListTest2Student stu2 = new ArrayListTest2Student("张si",19);
        ArrayListTest2Student stu3 = new ArrayListTest2Student("张wu",20);
        //3、往集合中添加3个学生对象
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //4、循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            //5、在循环中，获取循环元素，打印输出
            ArrayListTest2Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
