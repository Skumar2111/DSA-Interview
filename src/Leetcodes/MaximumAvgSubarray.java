package Leetcodes;

public class MaximumAvgSubarray {

    public static void main(String[] args) {
        int[] nums= {};
        findMaxAverage(nums,3);
    }
        public static double findMaxAverage(int[] nums, int k) {

            int curr = 0;

            for(int i = 0 ; i < k ; i++)
            {
                curr += nums[i];
            }

            double res = (double)curr/k;


            for(int i = k ; i < nums.length; i++)
            {
                curr = (curr + nums[i] - nums[i - k]);
                double currRes = (double)curr/k;
                res = Math.max(res,currRes);
            }

            return res;
        }

    }


