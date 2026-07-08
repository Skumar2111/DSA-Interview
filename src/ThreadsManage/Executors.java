package ThreadsManage;

import java.util.concurrent.ExecutorService;

public class Executors {

    public static void main(String[] args) {

        var executors = java.util.concurrent.Executors.newSingleThreadExecutor();

        var multiExecutors = java.util.concurrent.Executors.newFixedThreadPool(3);
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


        //executors.execute(runnable);

        multiExecutors.execute(runnable);
        multiExecutors.execute(runnable2);

        executors.shutdown();
        multiExecutors.shutdown();
    }
}
