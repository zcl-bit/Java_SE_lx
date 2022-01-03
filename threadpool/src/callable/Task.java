package callable;

import java.util.concurrent.Callable;

/**
 * @author: zcl
 * @create: 2022/1/3 7:22
 */
public class Task implements Callable<String> {
    private int i;

    public Task(int i ){
        this.i = i ;
    }

    @Override
    public String call()  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName()+"is running" + i;
    }
}
