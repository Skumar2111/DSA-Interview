package Leetcodes;

/*
* LeetCode - 75 Sort Colors
* https://leetcode.com/problems/sort-colors/description/
* */


public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);

    }
        public static void sortColors(int[] nums) {

            int start = 0;
            int mid = 0;
            int end = nums.length - 1;

            while(mid <= end)
            {
                switch(nums[mid])
                {
                    case 0:
                        swap(nums, start , mid);
                        start++;
                        mid++;
                        break;

                    case 1:
                        mid++;
                        break;

                    case 2:
                        swap(nums,mid,end);
                        end--;
                        break;
                }
            }


        }


        public static void swap(int[] nums , int pos1 , int pos2)
        {
            int temp = nums[pos1];
            nums[pos1] = nums[pos2];
            nums[pos2] = temp;
        }
    }

