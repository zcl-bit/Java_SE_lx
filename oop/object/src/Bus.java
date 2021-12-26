/**
 * @author zcl
 * @date 2021/12/26 8:47
 */
public class Bus extends MotoVehicle {
    private int seatCount;

    public Bus(){

    }

    public Bus(int no,String brand,int seatCount){
        super(no,brand);
        this.seatCount = seatCount;
    }


    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public int calcRent(int day) {
        if (seatCount > 16) {
            return 1500 * day;
        } else {
            return 800 * day;
        }
    }
}
