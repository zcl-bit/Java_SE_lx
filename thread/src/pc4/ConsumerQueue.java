package pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @author: zcl
 * @create: 2022/1/2 10:25
 *
 * 从共享空间中取走产品
 * */
public class ConsumerQueue implements Runnable {

    private BlockingQueue<Goods> blockingQueue;

    public ConsumerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费者消费的商品是："+goods.getBrand()+"--"+goods.getName());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
