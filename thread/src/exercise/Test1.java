package exercise;

/**
 * @author: zcl
 * @create: 2022/1/2 9:32
 */
public class Test1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"====="+i);
            try {
                //实现交替需有时间差，两者休眠时间相同，无意义
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Thread thread = new Thread(test1);
        thread.start();
        for(int i=10;i>0;i--){
            System.out.println(Thread.currentThread().getName()+"----"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
