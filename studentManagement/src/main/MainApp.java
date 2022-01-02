package main;

import domain.Student;
import domain.Teacher;
import domain.Teacher;
import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2021/12/29 16:41
 */
public class MainApp {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //创建ArrayList集合，限制集合元素的类型为Student
        ArrayList<Student> studentArrayList = new ArrayList<>();
        //创建ArrayList集合，限制集合元素的类型为Teacher
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
        //主菜单循环生成
        while (true) {
            System.out.println("===================================================");
            System.out.println("1.学生信息管理系统\t2.教师信息管理系统\t3.退出");
            System.out.println();
            System.out.println("请输入功能序号：");
            int op = sc.nextInt();
            //判断用户选择的功能序号
            switch (op) {
                case 1:
                    //进入学生信息管理系统
                    studentManage(studentArrayList, sc);
                    break;
                case 2:
                    //进入教师信息管理系统
                    teacherManage(teacherArrayList, sc);
                    break;
                case 3:
                    //系统退出
                    System.out.println("谢谢您，欢迎您下次再来");
                    System.exit(0);
                default:
                    System.out.println("您输入有误，请重新输入");
                    break;
            }

        }

    }

    /**
     * 学生管理系统
     *
     * @param list
     */
    public static void studentManage(ArrayList<Student> list, Scanner sc) {
        //循环生成二级菜单
        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("【学生信息管理】：");
            System.out.println("1、添加学生\t2、查询学生\t3、修改学生\t4、删除学生\t5、返回");
            System.out.println();
            System.out.println("请输入功能序号：");
            int op = sc.nextInt();
            //判断
            switch (op) {
                case 1:
                    //添加学生

                    addStudent(list, sc);
                    break;
                case 2:
                    //查询学生
                    selectStudent(list, sc);
                    break;
                case 3:
                    //修改学生
                    updateStudent(list, sc);
                    break;
                case 4:
                    //删除学生
                    deleteStudent(list, sc);
                    break;
                case 5:
                    //返回
                    return;
                default:
                    System.out.println("您输入的序号有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 添加学生信息
     *
     * @param list
     * @param sc
     */
    public static void addStudent(ArrayList<Student> list, Scanner sc) {

        //1、输入学生信息
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入出生日期：");
        String birthday = sc.next();

        //2、创建学生对象
        Student student = new Student();

        //3、把输入的信息封装到学生对象上
//        Utils.sid++ ;
        student.setId(Utils.sid);
        student.setName(name);
        student.setSex(sex);
        student.setBirthday(birthday);
        student.setAge(Utils.birthdayToAge(birthday));

        //4、把学生对象添加到集合中
        list.add(student);

        System.out.println("【添加成功】");
    }

    /**
     * 查询学生信息
     *
     * @param list
     * @param sc
     */
    public static void selectStudent(ArrayList<Student> list, Scanner sc) {
        //1、判断集合中是否有学生对象
        //2、如果没有学生对象，就显示提示信息
        if (list.size() == 0) {
            System.out.println("【没有数据!】");
            return;
        }

        //3、如果有学生对象，把集合中所有的元素按照指定格式打印输出
        Utils.printArrayList(list);
    }

    /**
     * 修改学生信息
     *
     * @param list
     * @param sc
     */
    public static void updateStudent(ArrayList<Student> list, Scanner sc) {
        //1、输入要修改的学生编号
        System.out.println("请输入要修改的学生编号：");
        int sid = sc.nextInt();

        //2、判断要修改的学生编号是否存在
//        //定义一个旗帜变量
//        //表示编号不存在
//        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            //2.1 获取遍历出来的学生对象
            Student stu = list.get(i);
            //2.2 判断遍历出来的学生对象的id和输入的id是否相同
            if (stu.getId() == sid) {
                //4、如果存在，就修改（保留原有信息的功能）
                System.out.println("您要修改的学生信息是：");
                Utils.printPerson(stu);

                System.out.println("请输入新姓名（保留原值输入0）：");
                String name = sc.next();
                System.out.println("请输入新性别（保留原值输入0）：");
                String sex = sc.next();
                System.out.println("请输入新出生日期（yyyy-MM-dd）（保留原值输入0）：");
                String birthday = sc.next();

                //判断输入的信息
                if (!"0".equals(name)) {
                    stu.setName(name);
                }
                if (!"0".equals(sex)) {
                    stu.setName(sex);
                }
                if (!"0".equals(birthday)) {
                    stu.setName(birthday);
                    //修改年龄
                    stu.setAge(Utils.birthdayToAge(birthday));
                }

                //修改完了，就结束方法
                System.out.println("【成功】学生信息修改成功");
                return;
            }
        }

        //3、来到这里，说明要修改的学生编号一定不存在，就提示信息，结束方法
        System.out.println("【错误信息】：您要修改的学生编号" + sid + "不存在！");
    }

    /**
     * 删除学生信息
     *
     * @param list
     * @param sc
     */
    public static void deleteStudent(ArrayList<Student> list, Scanner sc) {
        //1、输入要删除的学生编号

        System.out.println("请输入要删除的学生编号：");
        int sid = sc.nextInt();

        //2、判断要删除的学生编号是否存在
        for (int i = 0; i < list.size(); i++) {
            //获取遍历出来的学生对象
            Student stu = list.get(i);
            //判断遍历出来的学生对象的id和要修改的学生对象的id是否相同
            if (stu.getId() == sid){
                //3、如果存在，就删除(确认删除)
                System.out.println("您要删除的学生信息是：");
                Utils.printPerson(stu);

                //确认删除
                System.out.println("【确认】您确定要删除这条信息吗？（y/n）：");
                String next = sc.next();

                //判断用户输入
                if (next.equalsIgnoreCase("n")){
                    //如果输入n，取消删除
                    System.out.println("【取消】删除操作已被取消");
                }
                if (next.equalsIgnoreCase("y")){
                    //如果输入y，删除
                    list.remove(i);
                    System.out.println("【成功】删除成功");
                }
                //删除完了，就结束方法
                return;
            }
        }


        //3、来到这里，说明要修改的学生编号一定不存在，就提示信息，结束方法
        System.out.println("【错误信息】：您要删除的学生编号" + sid + "不存在！");
    }

    /**
     * 老师管理系统
     *
     * @param list
     */

    public static void teacherManage(ArrayList<Teacher> list, Scanner sc) {
        //循环生成二级菜单
        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("【老师信息管理】：");
            System.out.println("1、添加老师\t2、查询老师\t3、修改老师\t4、删除老师\t5、返回");
            System.out.println();
            System.out.println("请输入功能序号：");
            int op = sc.nextInt();
            //判断
            switch (op) {
                case 1:
                    //添加老师
                    addTeacher(list, sc);
                    break;
                case 2:
                    //查询老师
                    selectTeacher(list, sc);
                    break;
                case 3:
                    //修改老师
                    updateTeacher(list, sc);
                    break;
                case 4:
                    //删除老师
                    deleteTeacher(list, sc);
                    break;
                case 5:
                    //返回
                    return;
                default:
                    System.out.println("您输入的序号有误，请重新输入");
                    break;
            }
        }
    }


    /**
     * 添加老师信息
     *
     * @param list
     * @param sc
     */
    public static void addTeacher(ArrayList<Teacher> list, Scanner sc) {

        //1、输入老师信息
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入出生日期：");
        String birthday = sc.next();

        //2、创建老师对象
        Teacher teacher = new Teacher();

        //3、把输入的信息封装到学生对象上
//        Utils.sid++ ;
        teacher.setId(Utils.sid);
        teacher.setName(name);
        teacher.setSex(sex);
        teacher.setBirthday(birthday);
        teacher.setAge(Utils.birthdayToAge(birthday));

        //4、把学生对象添加到集合中
        list.add(teacher);

        System.out.println("【添加成功】");
    }

    /**
     * 查询老师信息
     *
     * @param list
     * @param sc
     */
    public static void selectTeacher(ArrayList<Teacher> list, Scanner sc) {
        //1、判断集合中是否有老师对象
        //2、如果没有老师对象，就显示提示信息
        if (list.size() == 0) {
            System.out.println("【没有数据!】");
            return;
        }

        //3、如果有老师对象，把集合中所有的元素按照指定格式打印输出
        Utils.printArrayList(list);
    }

    /**
     * 修改老师信息
     *
     * @param list
     * @param sc
     */
    public static void updateTeacher(ArrayList<Teacher> list, Scanner sc) {
        //1、输入要修改的老师编号
        System.out.println("请输入要修改的老师编号：");
        int sid = sc.nextInt();

        //2、判断要修改的老师编号是否存在
//        //定义一个旗帜变量
//        //表示编号不存在
//        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            //2.1 获取遍历出来的老师对象
            Teacher teacher = list.get(i);
            //2.2 判断遍历出来的学生对象的id和输入的id是否相同
            if (teacher.getId() == sid) {
                //4、如果存在，就修改（保留原有信息的功能）
                System.out.println("您要修改的老师信息是：");
                Utils.printPerson(teacher);

                System.out.println("请输入新姓名（保留原值输入0）：");
                String name = sc.next();
                System.out.println("请输入新性别（保留原值输入0）：");
                String sex = sc.next();
                System.out.println("请输入新出生日期（yyyy-MM-dd）（保留原值输入0）：");
                String birthday = sc.next();

                //判断输入的信息
                if (!"0".equals(name)) {
                    teacher.setName(name);
                }
                if (!"0".equals(sex)) {
                    teacher.setName(sex);
                }
                if (!"0".equals(birthday)) {
                    teacher.setName(birthday);
                    //修改年龄
                    teacher.setAge(Utils.birthdayToAge(birthday));
                }

                //修改完了，就结束方法
                System.out.println("【成功】老师信息修改成功");
                return;
            }
        }

        //3、来到这里，说明要修改的老师编号一定不存在，就提示信息，结束方法
        System.out.println("【错误信息】：您要修改的老师编号" + sid + "不存在！");
    }

    /**
     * 删除老师信息
     *
     * @param list
     * @param sc
     */
    public static void deleteTeacher(ArrayList<Teacher> list, Scanner sc) {
        //1、输入要删除的学生编号

        System.out.println("请输入要删除的老师编号：");
        int sid = sc.nextInt();

        //2、判断要删除的学生编号是否存在
        for (int i = 0; i < list.size(); i++) {
            //获取遍历出来的学生对象
            Teacher teacher = list.get(i);
            //判断遍历出来的学生对象的id和要修改的学生对象的id是否相同
            if (teacher.getId() == sid){
                //3、如果存在，就删除(确认删除)
                System.out.println("您要删除的老师信息是：");
                Utils.printPerson(teacher);

                //确认删除
                System.out.println("【确认】您确定要删除这条信息吗？（y/n）：");
                String next = sc.next();

                //判断用户输入
                if (next.equalsIgnoreCase("n")){
                    //如果输入n，取消删除
                    System.out.println("【取消】删除操作已被取消");
                }
                if (next.equalsIgnoreCase("y")){
                    //如果输入y，删除
                    list.remove(i);
                    System.out.println("【成功】删除成功");
                }
                //删除完了，就结束方法
                return;
            }
        }


        //3、来到这里，说明要修改的老师编号一定不存在，就提示信息，结束方法
        System.out.println("【错误信息】：您要删除的老师编号" + sid + "不存在！");
    }
//
//    private static void method03() {
//        ArrayList<Teacher> studentArrayList = new ArrayList<>();
//        Teacher stu1 = new Teacher(1, "张三", "男", "1999-10-10", 20);
//        Teacher stu2 = new Teacher(2, "张三", "男", "1999-10-10", 20);
//        Teacher stu3 = new Teacher(3, "张三", "男", "1999-10-10", 20);
//        studentArrayList.add(stu1);
//        studentArrayList.add(stu2);
//        studentArrayList.add(stu3);
//        Utils.printArrayList(studentArrayList);
//
//        System.out.println("+=====================================");
//        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
//        Teacher tea1 = new Teacher(1, "张三", "男", "1999-10-10", 20);
//        Teacher tea2 = new Teacher(2, "张三", "男", "1999-10-10", 20);
//        Teacher tea3 = new Teacher(3, "张三", "男", "1999-10-10", 20);
//        teacherArrayList.add(tea1);
//        teacherArrayList.add(tea2);
//        teacherArrayList.add(tea3);
//        Utils.printArrayList(teacherArrayList);
//    }
//
//    private static void method02() {
//        Teacher stu = new Teacher(1, "张三", "男", "1999-10-10", 20);
//        Teacher tea = new Teacher(1, "张三", "男", "1999-10-10", 20);
//        Utils.printPerson(stu);
//        Utils.printPerson(tea);
//    }
//
//    public static void method01() {
//        System.out.println(Utils.birthdayToAge("1999-10-10"));
//        System.out.println(Utils.birthdayToAge("1999-04-04"));
//        System.out.println(Utils.birthdayToAge("1999-01-10"));
//        System.out.println(Utils.birthdayToAge("1999-01-01"));
//        System.out.println(Utils.birthdayToAge("2999-01-01"));
//        System.out.println(Utils.birthdayToAge(null));
//    }
}
