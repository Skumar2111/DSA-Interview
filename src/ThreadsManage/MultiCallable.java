package ThreadsManage;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class MultiCallable {

    public static void main(String[] args) {
        var executors = Executors.newFixedThreadPool(3);

        CountDownLatch countDownLatch = new CountDownLatch(2);
        List<Callable<Integer>> tasks = List.of(
                () -> 10,
                () -> 20,
                () -> 30,
                () -> 40
        );

        System.out.println("Countdown latch : "+countDownLatch.getCount());

        try {
            List<Future<Integer>> futureTasks = executors.invokeAll(tasks);

            for(Future<Integer> future : futureTasks)
            {
                System.out.println(future.get() +" from :" +Thread.currentThread());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executors.shutdown();


    }
}
