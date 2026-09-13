public class TestingStatic {

    static
    {
        System.out.println("This is my static");
    }

    static int y = 100;

    static{
        System.out.println(y);
    }

    public TestingStatic() {
        System.out.println("This is testing constructor");
    }


}


