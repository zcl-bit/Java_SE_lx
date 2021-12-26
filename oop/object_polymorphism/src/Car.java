/**
 * @author zcl
 * @date 2021/12/26 8:47
 */
public class Car extends MotoVehicle {
    private String type;

    public Car(){

    }

    public Car(int no,String brand,String type){
        super(no,brand);
        this.type = type;
    }

    public Car(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int calcRent(int day) {
        if ("0".equals(type)) {
            return 600 * day;
        } else if ("1".equals(type)) {
            return 500 * day;
        } else if ("2".equals(type)) {
            return 300 * day;
        } else {
            System.out.println("类型不匹配");
            return 0;
        }
    }
}
