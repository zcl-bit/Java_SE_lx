/**
 * @author: zcl
 * @create: 2022/1/2 9:12
 */
public class MyRun implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
    }
}
