public class SubStatic extends TestingStatic
{
    static
    {
        System.out.println("This is my 2nd static subclass");
    }

    public SubStatic() {
        super();
        System.out.println("My 2nd static");
    }

    public static void main(String[] args) {
        SubStatic ss = new SubStatic();

    }
}
