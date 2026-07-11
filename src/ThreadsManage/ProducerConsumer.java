package ThreadsManage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {

    public static void main(String[] args) {

        BlockingQueue<Integer> blockingDeque = new ArrayBlockingQueue<Integer>(3);

        ReentrantLock lock = new ReentrantLock();

        Thread producer = new Thread(() ->
        {

            for(int i = 0 ; i < 5 ; i++ )
            {
                System.out.println("Produced : " +i);
                try {
                    blockingDeque.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });


        Thread consumer = new Thread(() ->
        {
            while(true)
            {
                try {
                    Integer value = blockingDeque.take();

                    System.out.println(value);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });


        producer.start();
        consumer.start();





    }

}
