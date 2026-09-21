package ThreadsManage;

public class CustomThread extends Thread{


    public void run()
    {
        for(int i = 0 ; i < 10 ; i++)
        {
            try {
                Thread.sleep(10);
                System.out.println("From Custom" +i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
