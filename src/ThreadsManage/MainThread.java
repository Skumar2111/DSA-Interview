package ThreadsManage;

public class MainThread {

    public static void main(String[] args) {

        System.out.println("Working with Thread : " +Thread.currentThread());

        Thread.currentThread().setPriority(1);
        Thread.currentThread().setName("Modified Main");
        for(int i = 0 ; i < 10 ; i++)
        {
            System.out.println("Print execution for Number :" +i +" from thread :"+Thread.currentThread());
        }

        System.out.println("Exit from : " +Thread.currentThread());

    }
}
