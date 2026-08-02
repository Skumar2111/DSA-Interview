package Leetcodes;

import java.util.HashSet;
/*
* LeetCode Problem - 217
* https://leetcode.com/problems/contains-duplicate/description/
* */

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        boolean result;
        result = containsDuplicate(nums);

        System.out.println(result);

    }


    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(hashSet.contains(nums[i]))
            {
                return true;
            }
            hashSet.add(nums[i]);
        }

        return false;

        }

    }

