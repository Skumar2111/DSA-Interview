package ThreadsManage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorsNew {

    public static void main(String[] args) {

        var executor = Executors.newWorkStealingPool(5);

        var executorCallable = Executors.newFixedThreadPool(3);

        Runnable runnable = () ->
        {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Calling" + i + "from thread" + Thread.currentThread());
            }
        };


        Future<?> future = executor.submit(runnable);
        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();


        List<Integer> list = IntStream.rangeClosed(0,50).boxed().toList();

        list.parallelStream().forEach(i -> System.out.println(i + " printing for " +Thread.currentThread()));


        Callable<Integer> taskCallable = () ->
        {
            System.out.println("Executing on Thread : " +Thread.currentThread().getName());
            return 1000;
        };

        Future<Integer> futureTask = executorCallable.submit(taskCallable);

        try {
            Integer result = futureTask.get();
            System.out.println("This is from future callable :"+result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorCallable.shutdown();

    }
}
