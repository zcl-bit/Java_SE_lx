package innnerdemo2;

/**
 * @author: zcl
 * @create: 2021/12/27 9:38
 */
public class StaticClass {
    private int id;
    public void test(){
        System.out.println("test");
    }

    //静态内部类
    static class InnerClass{
        private String name;
        public void show(){
            System.out.println("show");
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new StaticClass.InnerClass();
    }
}
