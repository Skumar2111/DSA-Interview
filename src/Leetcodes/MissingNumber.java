package Leetcodes;

/*
*
*  LeetCode Problem - 268
*  https://leetcode.com/problems/missing-number/
*
* */


public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {3,0,1};

        int missing_number = missingNumber(nums);

        System.out.println(missing_number);

    }


    public static int missingNumber(int[] nums) {

        int sum = ((nums.length) * (nums.length + 1)) / 2;
        int actual = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            actual = actual + nums[i];
        }

        return sum - actual;

    }
}
