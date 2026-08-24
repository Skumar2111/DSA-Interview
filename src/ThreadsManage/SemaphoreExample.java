package ThreadsManage;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    private static final Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            int threadId = i;

            new Thread(() -> {

                try {
                    // Acquire a permit
                    semaphore.acquire();

                    System.out.println(
                            "Thread " + threadId +
                                    " acquired connection"
                    );

                    // Simulate database operation
                    Thread.sleep(2000);

                    System.out.println(
                            "Thread " + threadId +
                                    " finished"
                    );

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();

                } finally {
                    // Release permit
                    semaphore.release();
                }

            }).start();
        }
    }
}