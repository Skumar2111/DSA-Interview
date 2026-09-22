package DP;

/**
 * Initiate checking from one end and try to identify the RR -
 * if( m == 0 || n == 0)
 * 1. If subsequence char matches at m-1 and n-1 if(string[m-1] == string[n-1] -> return 1 + LCS(m-1,n-1);
 *2 . If doesn't match we will iterate it from one direction until it reaches at some char.
 * Max Of - ( LCS(m-1,n) , LCS(n-1,m))
 */

public class StringSubsequence {

    public static void main(String[] args) {

        String input1 = "abdc";
        String input2 = "abca";

        int[][] memo = new int[input1.length()+1][input2.length()+1];


        for(int i = 0 ; i < input1.length()+1; i++)
        {
            for(int j = 0 ; j < input2.length()+1 ; j++)
            {
                memo[i][j] = -1;
            }
        }

        int lcs = calculateSubsequence(input1,input2,input1.length(),input2.length(),memo);

        System.out.println(lcs);

    }

    private static int calculateSubsequence(String input1, String input2, int m , int n , int[][] memo) {

        if(m == 0 || n == 0)
        {
            return 0;
        }

        if(memo[m][n] != -1) return memo[m][n];

        if(input1.charAt(m-1) == input2.charAt(n-1))
        {
            memo[m][n] = 1 + calculateSubsequence(input1, input2, m - 1, n - 1, memo);

        }
        else
        {
            memo[m][n] =  Math.max(calculateSubsequence(input1,input2,m,n-1,memo),calculateSubsequence(input1,input2,m-1,n,memo));

        }

        return memo[m][n];
    }
}
