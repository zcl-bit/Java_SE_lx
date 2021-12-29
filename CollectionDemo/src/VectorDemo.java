import java.util.Vector;

/**
 * @author: zcl
 * @create: 2021/12/29 8:30
 * vector也是list接口的一个子类是心啊
 * 跟ArrayList一样，底层使用数组实现
 * 区别：
 *      （1）ArrayList是线程不安全的，效率高，Vector是线程安全的效率低
 *  *   （2）ArrayList在进行扩容的时候，是扩容1.5倍，Vector扩容的时候扩容原来的2倍
 *
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add("abc");
        System.out.println(vector);
    }
}
