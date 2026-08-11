package DP;

public class CountWays {

    static int c = 0;
    public static void main(String[] args) {

        int[] coins = {1,2,3};
        int sum = 4;
        int n = coins.length;

        int ways = countWays(coins,n,sum);

        System.out.println(ways);
        System.out.println(c);

    }

    private static int countWays(int[] coins, int n, int sum) {
        if(sum == 0)
        {
            return 1;
        }
        if(sum < 0)
        {
            return 0;
        }
        if(n == 0)
        {
            return 0;
        }

        return  countWays(coins,n,sum - coins[n-1]) + countWays(coins,n-1,sum);
    }
}
