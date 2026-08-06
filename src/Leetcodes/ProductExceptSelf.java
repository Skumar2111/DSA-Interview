package Leetcodes;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        productExceptSelf(nums);

        for(int i = 0 ; i < nums.length ; i++)
        {
            System.out.println(nums[i]);
        }

    }

        public static int[] productExceptSelf(int[] nums) {

            int[] result = new int[nums.length];

            Arrays.fill(result,1);

            for(int i = 0 ; i < nums.length ; i++)
            {
                for(int j = 0 ; j < nums.length ; j++)
                {
                    if(i != j)
                    {
                        result[i] *= nums[j];
                    }
                }
            }

            return result;

        }
    }

