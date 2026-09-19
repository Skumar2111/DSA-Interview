package Recursion;

public class NumberRecusion {

    public static void main(String[] args) {

        int number = 5;
        printNumber(number);

    }

    private static void printNumber(int number) {

        if(number == 0)
        {
            return;
        }

        printNumber(number - 1);

        System.out.println(number);
    }

}
