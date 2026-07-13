package DSA;

public class CheckNumberPalindrome {

    public static void main(String[] args) {

        int number = 121;

        System.out.println(checkPalindrome(number));

    }

    private static boolean checkPalindrome(int number) {

        int x = number;
        int rev = 0;

        if (x < 0)
        {
            System.out.println("false");
            return false;
        }

        while(number > 0)
        {
            rev = rev * 10 + (number % 10);
            number = number/10;
        }

        if(rev == x)
        {
            System.out.println(true);
            return true;
        }
        else
        {
            System.out.println(false);
            return false;
        }

    }
}
