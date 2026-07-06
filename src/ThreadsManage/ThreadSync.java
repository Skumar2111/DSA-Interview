package ThreadsManage;

public class ThreadSync {

    public static void main(String[] args) {

        Banking banking = new Banking(1000);

        Thread thread1 = new Thread(() -> banking.deposit(1000));
        Thread thread2 = new Thread(() -> banking.withdraw(300));
        Thread thread3 = new Thread(() -> banking.deposit(1000));


        thread1.start();
        thread2.start();
        thread3.start();




    }
}
