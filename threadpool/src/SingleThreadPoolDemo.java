import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: zcl
 * @create: 2022/1/2 13:44
 */
public class SingleThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0;i<20;i++){
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}
