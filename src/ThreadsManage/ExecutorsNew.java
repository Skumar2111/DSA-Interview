package ThreadsManage;

import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class ExecutorsNew {

    public static void main(String[] args) {

        var executor = Executors.newWorkStealingPool(5);

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
    }
}
