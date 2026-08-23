package Concurrency;

import java.util.concurrent.*;

public class ConcurrentBasics {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(() ->
        {
            System.out.println("Executing" +Thread.currentThread());
            return 10;
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();

        completableFuture.supplyAsync(() ->
        {
            return 10;
        });

        CompletableFuture<Integer> f1 =
                CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> f2 =
                f1.thenApply(x -> x * 2);


        try {
            System.out.println(f2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



        CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<String> combined =
                future1
                        .thenCombine(
                                future2,
                                (s1, s2) -> s1 + " " + s2
                        )
                        .thenCombine(
                                future3,
                                (s1, s3) -> s1 + " " + s3
                        );

        try {
            System.out.println(combined.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
