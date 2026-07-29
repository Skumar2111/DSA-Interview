package DP;

import java.util.Arrays;

public class EditDistanceDP {


    public static void main(String[] args) {

      /*  String input1 = "voldemort";
        String input2 = "dumbledore";*/

        String input1 = "Saturday";
        String input2 = "Sunday";


        int m = input1.length();
        int n = input2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i = 0 ; i < m+1; i++)
        {
            Arrays.fill(dp[i], -1);
        }

        int edit = editDistanceDP(input1,input2,m,n, dp);

        System.out.println(edit);

    }

    private static int editDistanceDP(String input1, String input2, int m, int n, int[][] dp) {

        if(m == 0 )
        {
            return n;
        }
        if(n == 0)
        {
            return m;
        }


        if(dp[m][n] != -1)
        {
            return dp[m][n];
        }

        if(input1.charAt(m-1) == input2.charAt(n-1))
        {
            return dp[m][n] = editDistanceDP(input1,input2,m-1,n-1,dp);
        }
        else
        {
            int insert , delete , replace;

            insert = editDistanceDP(input1,input2,m,n-1,dp);

            delete = editDistanceDP(input1,input2,m-1,n,dp);

            replace = editDistanceDP(input1,input2,m-1,n-1,dp);


            return  dp[m][n] = 1 + Math.min(insert,Math.min(delete,replace));
        }


    }
}
