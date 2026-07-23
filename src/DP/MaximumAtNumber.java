package DP;

public class MaximumAtNumber {

    public static void main(String[] args) {

        int[] arr = {1,3,-1,4,7};

        int[] dp = new int[arr.length];

        dp[0] = arr[0];

        int ans = arr[0];

        for(int i = 1 ; i < arr.length; i++ )
        {
            dp[i] = Math.max(arr[i-1] + arr[i],arr[i]);
            ans = Math.max(ans,dp[i]);
        }

        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.println(dp[i]);
        }

    }


}

