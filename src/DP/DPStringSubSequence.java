package DP;

public class DPStringSubSequence {
    public static void main(String[] args) {

        String input1 = "abdc";
        String input2 = "abca";

        int m = input1.length();
        int n = input2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i = 0 ; i < m+1 ; i++)
        {
            for(int j = 0 ; j < n+1; j++)
            {
                dp[i][j] = -1;
            }
        }


        int result = findSubsequence(input1,input2,m,n,dp);

        System.out.println(result);
    }

    private static int findSubsequence(String input1, String input2, int m, int n, int[][] dp) {

        if(m == 0 || n == 0)
        {
            return 0;
        }

        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }

        if(input1.charAt(m-1) == input2.charAt(n-1))
        {
            dp[m][n] = 1 + findSubsequence(input1,input2,m-1,n-1,dp);

            return dp[m][n];
        }

        dp[m][n] = Math.max(findSubsequence(input1,input2,m-1,n,dp),findSubsequence(input1,input2,m,n-1,dp));

        return dp[m][n];
    }

}
