package changeJava;

import java.util.function.Predicate;

public class TestLambda {

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(10));


    }
}
