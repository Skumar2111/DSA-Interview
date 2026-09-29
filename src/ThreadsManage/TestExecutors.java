package ThreadsManage;

import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class TestExecutors {


    public static void main(String[] args) {

       // var executor = Executors.newFixedThreadPool(2);

     // var executor = Executors.newCachedThreadPool();

        var executor = Executors.newWorkStealingPool(3);


        Runnable runnable = () ->
        {
            for(int i = 0 ; i < 500 ; i++)
            {
                System.out.println("Executing Thread" +Thread.currentThread().getName());
            }
        };

        Runnable runnable1 = () ->
        {
            for(int i = 0 ; i < 500 ; i++)
            {
                System.out.println("Executing Thread runnable 1" +Thread.currentThread().getName());
            }
        };

        Runnable runnable2 = () ->
        {
            for(int i = 0 ; i < 500 ; i++)
            {
                System.out.println("Executing Thread runnable 2" +Thread.currentThread().getName());
            }
        };

        executor.execute(runnable);
        executor.execute(runnable1);
        executor.execute(runnable2);


        Future<Integer> future =
                executor.submit(() -> {
                    Thread.sleep(5000);
                    return 10 + 20;
                });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
        completableFuture.supplyAsync(() ->
        {
            try {
                Thread.sleep(5000);
                return 10+30;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        try {
            System.out.println("Completable "+completableFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();


    }

}
