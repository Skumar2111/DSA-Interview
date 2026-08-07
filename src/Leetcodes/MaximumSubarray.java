package Leetcodes;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);

        System.out.println(result);
    }

        public static int maxSubArray(int[] nums) {

            int currentSum = nums[0];
            int sum = nums[0];

            for (int i = 1; i < nums.length; i++) {

                currentSum = Math.max(nums[i], currentSum + nums[i]);

                sum = Math.max(sum, currentSum);
            }

            return sum;
        }
    }


