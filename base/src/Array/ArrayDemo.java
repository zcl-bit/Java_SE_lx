package Array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(array[0]);

        //输入五个数值，求平均值
        int[] arr = {56,98,34,89,100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(sum/arr.length);
    }
}
