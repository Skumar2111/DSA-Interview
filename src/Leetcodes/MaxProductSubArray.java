package Leetcodes;

/* LeetCode 152*/
public class MaxProductSubArray {

    public static void main(String[] args) {

        int[] nums = {2,3,-2,4};

        System.out.println(maxProduct(nums));

    }


        public static int maxProduct(int[] nums) {

            int n = nums.length;
            int leftToRight = 1;
            int rightToLeft = 1;
            int max_product = Integer.MIN_VALUE;

            for(int i = 0 ; i < n ; i++)
            {
                if(leftToRight == 0)
                {
                    leftToRight = 1;
                }
                if(rightToLeft == 0)
                {
                    rightToLeft = 1;
                }

                leftToRight *= nums[i];

                int j = n - 1 - i;

                rightToLeft *= nums[j];

                max_product = Math.max(max_product , Math.max(leftToRight, rightToLeft));
            }

            return max_product;

        }
    }

