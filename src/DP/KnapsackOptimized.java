package DP;

public class KnapsackOptimized {


    public int findTargetSumWays(int[] nums, int target) {

        int totalSum = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            totalSum += nums[i];
        }

        if(Math.abs(target) > totalSum)
        {
            return 0;
        }

        if((target + totalSum)%2 != 0)
        {
            return 0;
        }

        int subsetSum = (target + totalSum) / 2;

        int[][] dp = new int[nums.length + 1][subsetSum + 1];

        dp[0][0] = 1;

        for(int i = 1 ; i <= nums.length; i++)
        {
            int current = nums[i-1];

            for (int sum = 0; sum <= subsetSum; sum++) {

                // Skip current number
                dp[i][sum] = dp[i - 1][sum];

                // Take current number
                if (sum >= current) {
                    dp[i][sum] += dp[i - 1][sum - current];
                }
            }

        }

        return dp[nums.length][subsetSum];


    }
}
