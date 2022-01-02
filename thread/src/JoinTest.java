/**
 * @author: zcl
 * @create: 2022/1/2 9:12
 */
public class JoinTest {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"-----------------"+i);
            if(i==3){
                try {
                    //当线程执行到3时，强制阻塞当前进程，执行其他进程
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
