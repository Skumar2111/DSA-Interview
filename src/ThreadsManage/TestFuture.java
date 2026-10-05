package ThreadsManage;

import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class TestFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> future = executorService.submit(() ->
        {
            Thread.sleep(3000);
            return 10 + 20;
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.execute(()-> System.out.println("My Name"));


        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 20).thenApply(x -> x *2);

        completableFuture.thenApply(x -> x * 10);


        CompletableFuture<Integer> completableFuture1  =  completableFuture.thenCompose(x -> CompletableFuture.supplyAsync(() -> 30));

        completableFuture.thenCombine(completableFuture1,(a,b) -> a + b);

        System.out.println(completableFuture.get());



        System.out.println(completableFuture1.get());
        executorService.shutdown();
    }









}
