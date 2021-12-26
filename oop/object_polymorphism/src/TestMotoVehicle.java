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
        MotoVehicle[] motoVehicles = new MotoVehicle[5];
        motoVehicles[0] = new Car(1, "宝马", "1");
        motoVehicles[1] = new Car(1, "宝马", "1");
        motoVehicles[2] = new Car(2, "别克", "2");
        motoVehicles[3] = new Bus(3, "金龙", 34);
        motoVehicles[4] = new Track(4, "解放", 50);
        int totalMoney = calcTotal(motoVehicles);

        System.out.println("总租金是：" + totalMoney);
    }

    public static int calcTotal(MotoVehicle[] motoVehicles){
        int totalMoney = 0;
        for (int i = 0; i < motoVehicles.length; i++) {
            totalMoney += motoVehicles[i].calcRent(5);
        }
        return totalMoney;
    }
}
