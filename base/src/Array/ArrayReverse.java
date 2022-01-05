package Array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        System.out.println("原数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
        System.out.println();
        //1、从最后一个元素开始往前遍历
        System.out.println("数组取反后：");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");

        }
        System.out.println();


        //2、最后一个数据与第一个数据进行交换，以此类推
        int[] arr1 = {11, 22, 33, 44, 55, 66, 77};
        System.out.println("原数组为：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");

        }
        System.out.println();
        System.out.println("数组取反后：");
        int temp = 0;
        int len = arr1.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr1[len - 1 - i];
            arr1[len - 1 - i] = arr1[i];
            arr1[i] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();

    }


}
