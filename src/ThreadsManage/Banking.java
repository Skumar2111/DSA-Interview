package ThreadsManage;

public class Banking {

    private int balance;

    public int getBalance() {
        return balance;
    }


    public void deposit(int amount)
    {
        try
        {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            int originalBalance = balance;

            balance += amount;
            System.out.printf("Starting Balance: %d , Deposit %d , New Balance %d \n",originalBalance,amount,balance);
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


        synchronized (this) {
            int originalBalance = balance;
            if (balance > amount)
                balance -= amount;
            System.out.printf("Starting Balance: %d , Withdraw %d , New Balance %d \n",originalBalance,amount,balance);
        }

    }

}
