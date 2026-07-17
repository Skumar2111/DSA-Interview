package manageSports;

public class SetupMySports {

    public static void main(String[] args) {

        Sports cricket = new Cricket();

        Runnable runnable = (() ->
        {
            System.out.println(cricket.getPracticeInputs());

            System.out.println(cricket.getSportsDescription());

            System.out.println(cricket.rate());

        });

        Thread tFactory = new Thread(runnable);
        tFactory.start();

    }
}
