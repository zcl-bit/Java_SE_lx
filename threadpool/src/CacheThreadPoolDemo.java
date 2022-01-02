import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: zcl
 * @create: 2022/1/2 13:20
 */
public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0;i<20;i++){
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}
