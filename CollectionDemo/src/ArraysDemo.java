/**
 * @author: zcl
 * @create: 2021/12/31 10:18
 */

import java.util.Arrays;
import java.util.List;

/**
 * Arrays提供了数据操作的工具类，包含很多方法
 *      集合和数组之间的转换
 *          数组转成list：
 *
 *
 */
public class ArraysDemo {
    public static void main(String[] args) {
//        int[] array = new int[]{1,2,3,4,5};
        List<Integer> ints = Arrays.asList(1,2,3,4,5);

        //list转换成数组
        Object[] objects = ints.toArray();
    }
}
