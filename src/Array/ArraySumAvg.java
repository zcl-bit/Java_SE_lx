package Array;

public class ArraySumAvg {
    public static void main(String[] args) {
        int[] arr = {4,-1,9,10,23};
        int sum = 0;
        int avg;
        for (int j : arr) {
            sum += j;
        }
        avg = sum/ arr.length;
        System.out.println("数组的和为：" + sum);
        System.out.println("数组的平均值为：" + avg);
    }
}
