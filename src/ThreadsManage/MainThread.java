package ThreadsManage;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Working with Thread : " +Thread.currentThread());

        System.out.println(Thread.currentThread().getState());
        Thread.currentThread().setPriority(1);
        Thread.currentThread().setName("Modified Main");





        Thread custom = new Thread(new MyCustom());
        custom.start();


        /*Below is thread creation using extends Thread*/

      //  custom.join();

       /* Thread custom = new MyCustom();
        custom.start();*/


        Runnable runnable = () -> {
            for(int i = 0 ; i < 100 ; i++)
            {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                }
                catch(InterruptedException exp)
                {
                    exp.printStackTrace();
                    return;
                }
            }
        };

        Thread threadRunnable = new Thread(runnable);
        threadRunnable.start();

        threadRunnable.join();






        for(int i = 0 ; i < 10 ; i++)
        {
            try {
                System.out.println("Print execution for Number :" + i + " from thread :" + Thread.currentThread());
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }


        System.out.println("Exit from : " +Thread.currentThread());

    }
}
