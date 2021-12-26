/**
 * @author: zcl
 * @create: 2021/12/26 9:02
 */
public class TestMotoVehicle {
    public static void main(String[] args) {
//        MotoVehicle motoVehicle = new MotoVehicle() {
//            @Override
//            public int CalcRent(int day) {
//                return 0;
//            }
//        };抽象类中虽然可以进行构造方法的继承但是不允许实例化
        Car car = new Car(1,"宝马","1");
        System.out.println("租金是："+car.calcRent(5));
        Bus bus = new Bus(2,"金龙",20);
        System.out.println("租金是："+bus.calcRent(5));




    }
}
