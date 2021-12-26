/**
 * @author: zcl
 * @create: 2021/12/26 8:47
 */
public abstract class MotoVehicle {
    private int no;
    private String brand;
    public abstract int calcRent(int day);
    public MotoVehicle(){

    }

    public MotoVehicle(int no,String brand){
        this.no = no;
        this.brand = brand;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
