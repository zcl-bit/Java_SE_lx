package innnerdemo2;

import java.util.TreeMap;

/**
 * @author: zcl
 * @create: 2021/12/27 9:14
 */
public class NoNameInnerClassDemo {
    public static void main(String[] args) {
        System.out.println("有一万行代码");
        //匿名内部类 new AAA Implements Runnable()
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        System.out.println("有一万行代码");
    }

}

class Runner implements Runnable{

    @Override
    public void run() {

    }
}
