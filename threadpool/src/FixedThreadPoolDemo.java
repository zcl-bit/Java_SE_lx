import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: zcl
 * @create: 2022/1/2 13:31
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0 ;i<20;i++){
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}
