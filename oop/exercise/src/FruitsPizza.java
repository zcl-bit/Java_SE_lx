/**
 * @author: zcl
 * @create: 2021/12/27 11:04
 */
public class FruitsPizza extends Pizza{
    //属性：
    //配料
    private String burdening;

    //方法
    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    //构造器

    public FruitsPizza() {

    }

    public FruitsPizza(String name, int size, int price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }

    //重写父类Pizza中的showPizaa方法


    @Override
    public String showPizza() {
        return super.showPizza() + "\n水果是：" + burdening;
    }
}
