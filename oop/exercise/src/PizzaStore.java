import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2021/12/27 11:30
 */
public class PizzaStore {
    public static Pizza getPizza(int choice){
        Scanner in = new Scanner(System.in);
        Pizza p = null;
        switch (choice){
            case 1:
            {
                System.out.println("请录入培根的克数：");
                int weight = in.nextInt();
                System.out.println("请录入披萨的大小：");
                int size = in.nextInt();
                System.out.println("请录入披萨的价格：");
                int price = in.nextInt();
                //将录入的信息封装为培根披萨的对象
                BaconPizza baconPizza = new BaconPizza("培根披萨",size,price,weight);

                p = baconPizza;
            }
            break;
            case 2:
            {
                System.out.println("请输入想要加入的水果：");
                String fruit = in.next();
                System.out.println("请录入披萨的大小：");
                int sizeFruit = in.nextInt();
                System.out.println("请录入披萨的价格：");
                int priceFruit = in.nextInt();
                //将录入的信息封装为水果披萨的对象
                FruitsPizza fruitsPizza = new FruitsPizza("水果披萨",sizeFruit,priceFruit,fruit);

                p = fruitsPizza;

            }
            break;

        }
        return p;
    }
}
