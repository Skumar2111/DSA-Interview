package ThreadsManage;

import java.util.concurrent.ExecutorService;

public class Executors {

    public static void main(String[] args) {

        var executors = java.util.concurrent.Executors.newSingleThreadExecutor();

        var multiExecutors = java.util.concurrent.Executors.newFixedThreadPool(3);

        var cachedExecutors = java.util.concurrent.Executors.newCachedThreadPool();
        Runnable runnable = () ->
        {
            for(int i = 0 ; i < 50 ; i++)
            {
                System.out.println(i +" from thread : " +Thread.currentThread());

            }
        };

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

        executors.shutdown();
        multiExecutors.shutdown();
        cachedExecutors.shutdown();

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
