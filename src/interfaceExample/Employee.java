package interfaceExample;

public interface Employee {

    default void setup()
    {
        System.out.print("Running default setup service for employee");
        myPrivate();
    }

    static void callStatic()
    {
        System.out.println("This is static call and can't be inherited");

    }

    private void myPrivate()
    {
        System.out.println("This is my private");
    }

    public void myInterface();
}
