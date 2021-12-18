package Array;
/*
* 1
* 1 1
* 1 2   1
* 1 3   3   1
* 1 4   6   4   1
* 1 5   10  10  5   1
*
*
*
* 思路：
* 1、第一行有一个元素，第n行有n行元素
* 2、每一行的第一个元素和最后一个元素都是1
* 3、从第三行开始，对于非第一个元素和最后一个元素的元素值
* arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
*
*
* */
public class ArrayYangHui {
    public static void main(String[] args) {
        int[][] yangHui = new int[10][];
        //遍历yangHui的每个元素
        for (int i = 0; i < yangHui.length; i++) {
            //给每个一维数组开辟空间
            yangHui[i] = new int[i + 1];
            //给每个一维数组赋值
            for (int j = 0; j < yangHui[i].length; j++) {
                //每一行的第一个元素和最后一个元素都是1
                if (j == 0 || j == yangHui[i].length - 1){
                    yangHui[i][j] = 1;
                }else {//中间元素
                    yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
                }
            }

        }
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                //遍历输出该行
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
            
        }

    }
}
