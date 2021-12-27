import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2021/12/27 11:16
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入想要购买的披萨（1、培根披萨   2、水果披萨）");
        //选择
        int choice = in.nextInt();
        //通过工厂获取披萨
        Pizza pizza = PizzaStore.getPizza(choice);
        System.out.println(pizza.showPizza());



    }
}
