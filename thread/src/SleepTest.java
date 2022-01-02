/**
 * @author: zcl
 * @create: 2022/1/2 9:13
 */
public class SleepTest {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"=============="+i);
            if(i==2){
                try {
                    //当前进程执行到2时，让进程进行休眠1000毫秒，执行其他进程
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
