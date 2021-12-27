package innnerdemo2;

/**
 * @author: zcl
 * @create: 2021/12/27 8:52
 */
public class Outer {
    private String name = "张胜男";

    class Inner{
        private String name = "李四";
        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
