package pc4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author: zcl
 * @create: 2022/1/2 10:25
 * 多线程访问的时候出现了数据安全的问题
 *   1、生产者没有生产商品，消费者就可以获取
 *   2、商品的品牌和名称对应不上
 *
 * */
public class Test {
    public static void main(String[] args) {
        BlockingQueue<Goods> queue = new ArrayBlockingQueue<Goods>(5);
        ProducerQueue producerQueue = new ProducerQueue(queue);
        ConsumerQueue consumerQueue = new ConsumerQueue(queue);
        new Thread(producerQueue).start();
        new Thread(consumerQueue).start();


    }
}
