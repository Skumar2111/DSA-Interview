package DP;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 5;

        int[] fib = new int[n+2];


        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2 ; i <= n ; i++)
        {
            fib[i] = fib[i-1] + fib[i-2];
        }

       for(int i = 0 ; i < n ; i++)
       {
           System.out.print(" "+fib[i]);
       }
    }
}
