package pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @author: zcl
 * @create: 2022/1/2 10:25
 *
 *
 * 生产产品，将产房放置到共享空间中
 *
 * */
public class ProducerQueue implements Runnable {

    private BlockingQueue<Goods> blockingQueue;

    public ProducerQueue(BlockingQueue<Goods> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            Goods goods = null;
            if(i%2==0){
                goods = new Goods("娃哈哈","矿泉水");
            }else{
                goods = new Goods("旺仔","小馒头");
            }
            System.out.println("生产者开始生产商品："+goods.getBrand()+"--"+goods.getName());
            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
