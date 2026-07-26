package DP;

public class StringSubsequence {

    public static void main(String[] args) {

        String input1 = "abdc";
        String input2 = "abca";

        int lcs = calculateSubsequence(input1,input2,input1.length(),input2.length());

        System.out.println(lcs);

    }

    private static int calculateSubsequence(String input1, String input2, int m , int n) {

        if(m == 0 || n == 0)
        {
            return 0;
        }

        if(input1.charAt(m-1) == input2.charAt(n-1))
        {
            return 1 + calculateSubsequence(input1, input2, m - 1, n - 1);
        }
        else
        {
            return Math.max(calculateSubsequence(input1,input2,m,n-1),calculateSubsequence(input1,input2,m-1,n));
        }
    }
}
