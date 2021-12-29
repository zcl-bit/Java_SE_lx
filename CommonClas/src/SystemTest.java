/**
 * @author: zcl
 * @create: 2021/12/29 15:27
 */
public class SystemTest {
    public static void main(String[] args) {
        /**
         * 在控制台输出1-10000，计算这段代码执行了多少毫秒
         *
         * */
        //1、获取循环执行之前距离标准基准时间的毫秒值
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {

            System.out.println(i);
        }
        //2、获取循环执行之后距离标准基准时间的毫秒值
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
