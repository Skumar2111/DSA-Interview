package DP;

public class CountWaysDP {


    public static void main(String[] args) {

        int[] coins = {1,2,3};
        int sum = 4;
        int n = coins.length;

        int[][] dp = new int[coins.length+1][sum+1];

        for(int i = 0 ; i < coins.length+1; i++)
        {
            for(int j = 0 ; j < sum+1; j++)
            {
                dp[i][j] = -1;
            }
        }

        int ways = countWaysDP(coins,sum,n,dp);

        System.out.println(ways);

    }

    private static int countWaysDP(int[] coins, int sum, int n, int[][] dp) {

        if(sum == 0)
        {
            return dp[n][sum] = 1;
        }

        if(n == 0)
        {
            return 0;
        }

        if(dp[n][sum] != -1)
        {
            return dp[n][sum];
        }

        //Either to take coin or not
        if(coins[n-1] <= sum)
        {
            return dp[n][sum] = countWaysDP(coins,sum - coins[n-1],n-1,dp) +
                                countWaysDP(coins,sum,n-1,dp);

        }
        else
        {
            return dp[n][sum] = countWaysDP(coins,sum,n-1,dp);
        }


    }


}
