/**
 * @author: zcl
 * @create: 2021/12/27 15:16
 */
/**
 * 1、常量池在1.7之后放置在堆空间中
 * 2、字符串的本质
 *      本质是字符数组或者叫做字符序列
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("abc");
//        str2 = str2.intern();
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.charAt(0));
        //数组的复制过程
        System.out.println(str.concat("cd"));
        //返回指定元素的下标
        System.out.println(str.indexOf("a"));
        String a = "abc";
        String b = new String("abc");
        b = b.intern();
        System.out.println(a == b);
    }
}
