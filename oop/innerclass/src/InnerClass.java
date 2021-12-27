/**
 * @author: zcl
 * @create: 2021/12/27 8:33
 */
public class InnerClass {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("show");
        InnerClassDemo innerClassDemo = new InnerClassDemo();

//        System.out.println(age);
    }

    class InnerClassDemo {
        private int age;
        String name = "张三";

        public void test() {
            System.out.println("test");
            System.out.println(id);
            System.out.println(name);
        }

        class InnerInner {
            private int id;

            public void print() {
                System.out.println("print");
            }
        }
    }


    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClass().new InnerClassDemo();

    }

}

class Test {

}
