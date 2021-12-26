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
//        Car car = new Car(1,"宝马","1");
//        System.out.println("租金是："+car.calcRent(5));
//        Bus bus = new Bus(2,"金龙",20);
//        System.out.println("租金是："+bus.calcRent(5));
        MotoVehicle[] motoVehicles = new MotoVehicle[4];
        motoVehicles[0] = new Car(1, "宝马", "1");
        motoVehicles[1] = new Car(1, "宝马", "1");
        motoVehicles[2] = new Car(2, "别克", "2");
        motoVehicles[3] = new Bus(3, "金龙", 34);
        int totalMoney = 0;
        for (int i = 0; i < motoVehicles.length; i++) {
            totalMoney += motoVehicles[i].calcRent(5);
        }
        System.out.println("总租金是：" + totalMoney);
    }
}
