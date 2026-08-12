package Leetcodes;

/*
* LeetCode - 238
* */

public class ProductWithoutItself {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        productExceptSelf(nums);

    }

        public static int[] productExceptSelf(int[] nums) {

            int n = nums.length;

            int[] prefProduct = new int[n];
            int[] suffProduct = new int[n];

            int[] result = new int[n];

            prefProduct[0] = 1;

            for(int i = 1 ; i < n ; i++)
            {
                prefProduct[i] = nums[i - 1] * prefProduct[i - 1];
            }

            suffProduct[n - 1] = 1;
            for(int j = n -2 ; j >= 0 ; j--)
            {
                suffProduct[j] = nums[j + 1] * suffProduct[j + 1];
            }

            for(int i = 0 ; i < n ; i++)
            {
                result[i] = prefProduct[i] * suffProduct[i];
            }

            return result;
        }
    }

