package Array;

import java.util.Scanner;

/*
 * 数组增加元素
 * 要求：
 * 1、原始数组使用静态分配 int[] arr = {1,2,3}
 * 2、增加的元素直接放在数组的最后 arr = {,2,3,4}
 * 3、用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
 *
 * 思路分析：
 * 1、定义初始数组 int[] arr = {,2,3}
 * 2、定义一个新的数组 int[] arrNew = new int[arr.length + 1];
 * 3、遍历 arr 数组，依次将arr数组中的元素拷贝到arrNew数组中
 * 4、将4赋给arrNew[arrNew.length - 1] = 4，把4赋给arrNew最后一个元素
 * 5、让arr指向arrNew  arr = arrNew,原来arr数组就被销毁
 * 6、创建一个while循环或dowhile循环
 * 7、continue继续进行下一次循环
 * 8、break结束整个循环
 *
 * */
public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("原数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        System.out.println();
        /*while (true) {
            int[] arrNew = new int[arr.length + 1];
            //遍历 arr 数组，依次将arr数组中的元素拷贝到arrNew数组中
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入添加的数组数据：");
            Scanner sc = new Scanner(System.in);
            int addNumber = sc.nextInt();
            //将4赋给arrNew[arrNew.length - 1] = 4，把4赋给arrNew最后一个元素
            arrNew[arrNew.length - 1] = addNumber;
            //让arr指向arrNew  arr = arrNew,原来arr数组就被销毁
            arr = arrNew;
            //输出arr
            System.out.println("扩容后数组为：");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");

            }
            System.out.println();
            System.out.println("是否继续添加（y继续/n退出）");
            String continueAdd = sc.next();
            if (continueAdd.equals("y")) {
                continue;
            } else {
                break;
            }
            System.out.println("退出程序");
        }*/
        do{
            int[] arrNew = new int[arr.length + 1];
            //遍历 arr 数组，依次将arr数组中的元素拷贝到arrNew数组中
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入添加的数组数据：");
            Scanner sc = new Scanner(System.in);
            int addNumber = sc.nextInt();
            //将addNumber赋给arrNew[arrNew.length - 1] = addNumber，把addNumber赋给arrNew最后一个元素
            arrNew[arrNew.length - 1] = addNumber;
            //让arr指向arrNew  arr = arrNew,原来arr数组就被销毁
            arr = arrNew;
            //输出arr
            System.out.println("扩容后数组为：");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");

            }
            System.out.println();
            System.out.println("是否继续添加（y继续/n退出）");
            String continueAdd = sc.next();
            //接受char类型
            //char key = sc.next().charAt(0);
            if (continueAdd.equals("n")) {
                break;
            }
        }while(true);
        System.out.println("退出程序");


    }
}
