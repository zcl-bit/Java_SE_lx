package Array;
/*
* 已知有一个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如
* 【10，12，45，90】，添加 23 后，数组为【10，12，23，45，90】
*
* 思路：
* 1、添加数应该插入到哪个索引位
* 2、然后扩容
*
* */

public class HomeWork04 {
    public static void main(String[] args) {
        //定义原数组
        int[] arr = {10,12,45,90};
        //插入的位置
        int index = -1;
        //定义插入数据
        int number = 23;
        //遍历arr数组，如果发现 number小于等于arr【i】，说明i就是要插入的位置
        //使用index保留index = i；
        //如果遍历完后，未发现number <= arr[i]说明index = arr.length
        //即添加到arr的最后
        for (int i = 0; i < arr.length; i++) {
            if (number <= arr[i]){
                index = i;
                //找到位置后，就退出
                break;
            }
        }
        //判断index的值
        if (index == -1){
            //说明还没有找到位置
            index = arr.length;

        }
        //扩容
        //定义新数组
        int[] arrNew = new int[arr.length + 1];
        //下面准备将arr的元素拷贝到arrNew并且要跳过index的位置
        //i指向新数组
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index){
                arrNew[i] = arr[j];
                j++;
            }else {
                arrNew[i] = number;
            }
            System.out.print(arrNew[i] + "\t");

        }
        System.out.println();
    }
}
