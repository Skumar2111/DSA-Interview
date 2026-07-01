package Recursion;

public class Fibonacci {


    public static void main(String[] args) {

        int number = 10;

        System.out.println(fibonacci(number));
    }

    private static int fibonacci(int number) {

        if(number == 0) return 0;
        if (number == 1) return 1;

        return fibonacci(number-1) + fibonacci(number - 2);

    }
}
