/**
 * @author: zcl
 * @create: 2022/1/2 13:22
 */
public class Task implements Runnable{
    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+" running");
    }
}
