package Leetcodes;

public class SlidingWindowSum {

    public static void main(String[] args) {

        int[] nums = {1,8,30,-5,20,7};
        int k = 3;

        System.out.println(findSum(nums,k));
    }

    private static int findSum(int[] nums, int k) {

        int curr = 0;

        for(int i = 0 ; i < k ; i++)
        {
            curr += nums[i];
        }

        int res = curr;

        for(int i = k ; i < nums.length; i++)
        {
            curr = curr + nums[i] - nums[i - k];
            res = Math.max(res,curr);
        }

        return res;
    }
}
