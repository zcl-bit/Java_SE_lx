/**
 * 代码块：使用{}括起来的一段代码叫做代码块
 * 分类:
 * 普通代码块：定义在方法中，使用{}括起来的代码叫做普通代码块
 * 构造代码块：定义在类中的使用{}括起来的代码叫做构造代码块
 * 注意：每次代码运行的时候会将构造代码块中的代码添加到构造方法的前面
 * 静态代码块
 * 同步代码块
 */
public class CodeBlockDemo {
    int a;
    int b;


    public CodeBlockDemo() {
        System.out.println("构造方法");
    }

    {
        System.out.println("构造代码块");
    }
    public CodeBlockDemo(int a) {
        this.a = a;
    }

    public CodeBlockDemo(int a, int b) {
        this(a);
        this.b = b;
    }

    public void test() {
        System.out.println("test");
        {
            System.out.println("我应该是什么分类");
        }
    }

    public static void main(String[] args) {
        CodeBlockDemo codeBlockDemo = new CodeBlockDemo();
        codeBlockDemo.test();
        {
            System.out.println("main");
        }
    }
}
