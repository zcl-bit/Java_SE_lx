package Array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        //冒泡排序数组
        int[] insertArray ={1234,123,58,31,95,3,8,621};
        Arrays.sort(insertArray);
        for (int i = 0; i < insertArray.length; i++) {

            System.out.print(insertArray[i] + "\t");
        }
        System.out.println();

        int[] insertArray1 ={1234,123,58,31,95,3,8,621,5422,85};
        for (int i = 0; i < insertArray1.length; i++) {
            for (int j = 0; j < insertArray1.length - 1 - i; j++) {
                if (insertArray1[j] > insertArray1[j + 1]){
                    int temp = insertArray1[j];
                    insertArray1[j] = insertArray1[j + 1];
                    insertArray1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < insertArray1.length; i++) {

            System.out.print(insertArray1[i] + "\t");
        }

        System.out.println();

        //选择排序
        int[] checkArray ={12,123,58,31,95,3,8,621,5422,85,6,3,9,5852,12,82};
        for (int i = 0; i < checkArray.length; i++) {
            for (int j = i + 1; j < checkArray.length; j++) {
                if (checkArray[i] > checkArray[j]){
                    int temp = checkArray[i];
                    checkArray[i] = checkArray[j];
                    checkArray[j] = temp;
                }

            }

        }
        for (int i = 0; i < checkArray.length; i++) {

            System.out.print(checkArray[i] + "\t");
        }


    }
}
