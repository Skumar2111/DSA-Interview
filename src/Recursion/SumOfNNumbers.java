package Recursion;

public class SumOfNNumbers {

    public static void main(String[] args) {
        int number = 10;

        System.out.println(sumOfNumber(number));
    }

    private static int sumOfNumber(int number) {

        if(number == 0)
            return 0;

        return number + sumOfNumber(number-1);
    }
}
