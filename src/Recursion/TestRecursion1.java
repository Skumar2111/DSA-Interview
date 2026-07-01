package Recursion;

public class TestRecursion1 {

    public static void main(String[] args) {

        int number = 16;

        System.out.println(recursiveMethod(number));

    }

    private static int recursiveMethod(int number) {

        if (number == 1) {
            return 0;
        } else {
            return 1 + recursiveMethod(number / 2);
        }
    }
}
