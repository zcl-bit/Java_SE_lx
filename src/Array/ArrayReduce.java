package Array;

import java.util.Scanner;
/*要求：
 *1、有一个数组{1，2，3，4，5}，可以将该数组进行缩减
 *2、提示用户是否继续缩减
 *3、每次缩减最后的元素
 *4、只剩下一个元素时，提示不能在进行缩减
 *
 *
 * 思路：
 * 1、创建一个arr数组将{1，2，3，4，5}赋值到里面
 * 2、创建一个arrReduce数组 arrReduce = new int[arr.length - 1];
 * 3、遍历arr数组，将除最后一个元素的其他元素复制到arrReduce中
 * 4、让arr指向arrReduce数组，原arr数组销毁
 * 5、使用while循环
 * 6、continue继续进行下一次循环
 * 7、当数组长度为1时break结束循环
 *
 * */

public class ArrayReduce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("原数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        System.out.println();
        while(true){


            //创建一个arrReduce数组 arrReduce = new int[arr.length - 1];
            int[] reduceArr = new int[arr.length - 1];
            //遍历arr数组，将除最后一个元素的其他元素复制到arrReduce中
            for (int i = 0; i < arr.length - 1; i++) {
                reduceArr[i] = arr[i];
            }
            //让arr指向arrReduce数组，原arr数组销毁
            arr = reduceArr;
            System.out.println("缩减后的数组为：");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();

            //当数组长度为1时break结束循环
            if (arr.length == 1){
                System.out.println("当前数组已经缩减到最后一个元素");
                System.out.println("结束循环");
                break;
            }
            System.out.println("是否开始进行数组数据缩减 y/n:");
            String continueReduce = myScanner.next();
            //continue继续进行下一次循环
            if ("y".equals(continueReduce)){
                continue;
            }else {
                //break结束循环
                System.out.println("结束循环");
                break;
            }

        }

    }
}
