import java.util.LinkedList;

/**
 * @author: zcl
 * @create: 2021/12/29 8:15
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("123");
        linkedList.add(123);
        linkedList.add(true);
        System.out.println(linkedList);
        linkedList.add(1,"zcl");
        System.out.println(linkedList);
        linkedList.addFirst("bj");
        System.out.println(linkedList);
        linkedList.addLast("888");
        System.out.println(linkedList);
        System.out.println(linkedList.element());
    }
}
