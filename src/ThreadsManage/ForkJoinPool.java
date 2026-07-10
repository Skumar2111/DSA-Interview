package ThreadsManage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class ForkJoinPool {

    public static void main(String[] args) {

        int num_length = 100_000;

        long[] numbers = new Random().longs(num_length,1,num_length).toArray();

        long sum = Arrays.stream(numbers).sum();

        ExecutorService threadPool = Executors.newWorkStealingPool(4);

        List<Callable<Long>> tasks = new ArrayList<>();


        int task_Number = 10;

        int splitCount = num_length / task_Number;

        for(int i = 0 ; i < task_Number ; i++) {
            int start = i * splitCount;
            int end = start + splitCount;

            tasks.add(() ->
            {
                long taskSum = 0;
                for (int j = start; j < end; j++) {
                    taskSum += (long) numbers[j];

                }

                return taskSum;
            });
        }

            try {
                List<Future<Long>> futures = threadPool.invokeAll(tasks);
                int taskSum = 0;
                for (Future<Long> future : futures) {
                    taskSum += future.get();
                }
                System.out.println("Sum is : " +taskSum + " from thread" +Thread.currentThread());

                threadPool.shutdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }


        System.out.println(Thread.currentThread());
        }








    }

