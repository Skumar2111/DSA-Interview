package Streams;

@FunctionalInterface
public interface CompareTest {

    boolean compare(int a,int b);

    default void apple()
    {
        System.out.println("This is apple");
    }
}
