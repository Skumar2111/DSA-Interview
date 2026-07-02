package Recursion;

public class NumberSum {

    public static void main(String[] args) {

        int number = 235;
        int sum = 0 ;
        System.out.println(calculateSUm(number , sum));

    }

    private static int calculateSUm(int number, int sum) {

        if(number == 0)
        {
            return sum;
        }

        return calculateSUm(number/10,sum + (number % 10) );
    }
}
