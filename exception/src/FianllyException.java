/**
 * @author: zcl
 * @create: 2021/12/27 13:42
 */
public class FianllyException {
    public static void main(String[] args) {
        try{
            System.out.println(1/100);
            return;
        }catch (Exception e){
            e.printStackTrace();
            return;
        }finally {
            System.out.println("我是finally处理块");
            return;
        }
    }
}
