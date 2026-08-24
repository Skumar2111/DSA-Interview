package ThreadsManage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Executors {

    public static void main(String[] args) throws InterruptedException {

        var executors = java.util.concurrent.Executors.newSingleThreadExecutor();

        var multiExecutors = java.util.concurrent.Executors.newFixedThreadPool(3);

        var cachedExecutors = java.util.concurrent.Executors.newCachedThreadPool();

        var scheduledPool = java.util.concurrent.Executors.newScheduledThreadPool(2);
        Runnable runnable = () ->
        {
            for(int i = 0 ; i < 50 ; i++)
            {
                System.out.println(i +" from thread : " +Thread.currentThread());

            }
        };

        Semaphore semaphore = new Semaphore(2);

        semaphore.acquire();
        Runnable runnable2 = () ->
        {
            for(int i = 50 ; i > 0 ; i--)
            {
                System.out.println(i +" from thread : " +Thread.currentThread());

            }
        };

        Banking banking = new Banking(1000);
        multiExecutors.execute(() -> banking.deposit(1000));
        multiExecutors.execute(() -> banking.withdraw(200));

        executors.execute(CountingDown::countDown);

        multiExecutors.execute(runnable);
        multiExecutors.execute(runnable2);


        for(int count = 0 ; count < 5 ; count++) {
            System.out.println("From count" +count);
            cachedExecutors.execute(CountingDown::countDown);
        }

        scheduledPool.schedule(runnable,10, TimeUnit.SECONDS);
        executors.shutdown();
        multiExecutors.shutdown();
        cachedExecutors.shutdown();

        scheduledPool.shutdown();

    }
}

class CountingDown
{
    public static void countDown()
    {
        System.out.println("Call is from CountDown");
        for(int i = 0 ; i < 20 ; i++)
        {
            System.out.println(i + " from thread " +Thread.currentThread());
        }

    }
}
