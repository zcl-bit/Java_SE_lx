/**
 * @author: zcl
 * @create: 2021/12/27 14:49
 */
public class IntegerDemo {
    public static void main(String[] args) {
//        int a = 10;
//        Integer i = new Integer(10);
        //通过方法进行类型的转换
//        Integer i2 = Integer.valueOf(a);
//        int i3 = i.intValue();
//        System.out.println(a == i);
//        Float f1 = new Float(3.2);
//        Double d1 = new Double(3.14);
        /**
         * public static Integer valueOf(int i) {
         *         if (i >= IntegerCache.low && i <= IntegerCache.high)
         *             return IntegerCache.cache[i + (-IntegerCache.low)];
         *         return new Integer(i);
         *     }
         * */
        //因为100在-128-+127范围内，所以数据直接返回，不进行new
        //而200超过范围所以进行new操作，导致i3和i4不相等
//        Integer i1 = 100;
//        Integer i2 = 100;
//        Integer i3 = 200;
//        Integer i4 = 200;
//        System.out.println(i1 == i2);
//        System.out.println(i3 == i4);
//
//        //public static Double valueOf(double d) {
//        //        return new Double(d);
//        //    }
//        //因为每次都是在new对象，所以不相等
//        Double d1 = 1.0;
//        Double d2 = 1.0;
//        Double d3 = 2.0;
//        Double d4 = 2.0;
//        System.out.println(d1 == d2);
//        System.out.println(d3 == d4);
        //会把integer进行拆箱变成int类型
        Integer i = 10;
        int a = i;
        System.out.println(a == i);

    }
}
