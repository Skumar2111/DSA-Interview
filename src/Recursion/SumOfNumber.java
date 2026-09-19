package Recursion;

/*TC N
* SC N
* */
public class SumOfNumber {

    public static void main(String[] args) {
        int number = 5;

       int result =  sum(number);
        System.out.println(result);
    }

    private static int sum(int number) {

        if(number == 1)
        {
            return 1;
        }

        number = number + sum(number-1);

        return number;

    }

}
