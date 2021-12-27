/**
 * @author: zcl
 * @create: 2021/12/27 11:15
 */
public class BaconPizza extends Pizza{
    //属性
    private int weight;
    //方法
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //构造器
    public BaconPizza(String name, int size, int price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    public BaconPizza() {
    }
    //重写父类showPizza方法

    @Override
    public String showPizza() {
        return super.showPizza() + "\n培根的克数是:" + weight;
    }
}
