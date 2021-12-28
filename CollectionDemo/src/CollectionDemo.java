import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: zcl
 * @create: 2021/12/28 15:17
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        collection.add(1.23);
        collection.add("abc");
        System.out.println(collection);
        ((ArrayList) collection).add(0,"zcl");
        System.out.println(collection);
        Collection collection1 = new ArrayList();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.addAll(collection1);
        System.out.println(collection);
//        collection.clear();
//        System.out.println(collection);
        System.out.println(collection.contains("a"));
        System.out.println(collection.containsAll(collection1));
        System.out.println(collection.isEmpty());
        collection.remove("a");
        System.out.println(collection);
        System.out.println(collection.retainAll(collection1));
        collection.toArray();


    }
}
