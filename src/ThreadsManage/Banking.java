package ThreadsManage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banking {

    private int balance;

    public int getBalance() {
        return balance;
    }


    private final Lock lock = new ReentrantLock();

    public void deposit(int amount)
    {
        try
        {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock.lock();
        try {
            int originalBalance = balance;

            balance += amount;
            System.out.printf("Starting Balance: %d , Deposit %d , New Balance %d \n", originalBalance, amount, balance);
        } finally {
            lock.unlock();
        }

    }


    public Banking(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount)
    {
        try
        {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock.lock();
        try {
            int originalBalance = balance;
            if (balance > amount)
                balance -= amount;
            System.out.printf("Starting Balance: %d , Withdraw %d , New Balance %d \n", originalBalance, amount, balance);
        } finally {
            lock.unlock();
        }

    }

}
