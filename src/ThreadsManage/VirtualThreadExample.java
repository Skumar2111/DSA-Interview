package ThreadsManage;

public class VirtualThreadExample {

    public static void main(String[] args) {

        Thread producer  = new Thread(() ->

        {
            for(int i = 0 ; i < 100; i++)
            {
                System.out.println("Executing thread");
            }
        }
        );


        producer.start();


    }
}
