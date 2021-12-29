import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2021/12/29 15:31
 */
public class ArrayListTest {
    public static void main(String[] args) {
        /**
         * 创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
         **/
        //1、创建ArrayList集合，限制集合元素类型为String
        ArrayList<String> list = new ArrayList<>();
        //2、往集合中存储3个元素
        list.add("zcl");
        list.add("lbn");
        list.add("cs");
        //3、获取集合中元素的个数
        int size = list.size();
        //4、循环遍历
        for (int i = 0; i < size; i++) {
            //5、在循环中，获取元素，打印输出
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
