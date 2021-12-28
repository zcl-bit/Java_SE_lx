import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: zcl
 * @create: 2021/12/28 15:17
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add(true);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));
        list.set(0,"zcl");
        System.out.println(list);
        List list1 = list.subList(0,2);
        System.out.println(list1);
//        List.of();


    }
}
