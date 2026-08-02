package Leetcodes;

import java.util.HashMap;

/* LeetCode Problem - 1
*  https://leetcode.com/problems/two-sum/description/
*  */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = {-1,-1};
        output = evaluate2Sum(nums, target, output);

        for(int result : output)
        {
            System.out.printf(result+ " ");
        }
    }

    private static int[] evaluate2Sum(int[] nums, int target, int[] output) {

        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
            {
                int complement = target - nums[i];
                if(hMap.containsKey(complement))
                {
                    output[0] = i;
                    output[1] = hMap.get(complement);
                    return output;
                }
                hMap.put(nums[i],i);
            }
            return output;
        }
    }

