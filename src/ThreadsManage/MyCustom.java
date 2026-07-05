package ThreadsManage;

public class MyCustom implements Runnable
{
    @Override
    public void run() {

        for(int i = 0; i < 10; i++)
        {
            System.out.println("Value :" +i);

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException exception)
            {
                exception.printStackTrace();
            }
        }
    }
}
