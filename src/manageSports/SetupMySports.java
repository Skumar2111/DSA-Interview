package manageSports;

public class SetupMySports {

    public static void main(String[] args) throws InterruptedException {

        Sports cricket = new Cricket();

        Runnable runnable = (() ->
        {
            System.out.println(cricket.getPracticeInputs());

            System.out.println(cricket.getSportsDescription());

            System.out.println(cricket.rate());

        });


        Sports soccer = new Soccer();

        Runnable mySoccerRunnable = (() ->
        {
            System.out.println(soccer.getPracticeInputs());
            System.out.println(soccer.getSportsDescription());
            System.out.println(soccer.rate());
        });

        Thread tFactory = new Thread(runnable);
        tFactory.start();

        tFactory.join();

        Thread soccerFactory = new Thread(mySoccerRunnable);
        soccerFactory.start();

    }
}
