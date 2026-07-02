package Recursion;

public class Factorial {

    public static void main(String[] args) {

        int number = 10;

        System.out.println(factorialCheck(number));

    }

    private static int factorialCheck(int number) {

        if(number == 0)
        {
            return 1;
        }

        return number * factorialCheck(number-1);
    }
}
