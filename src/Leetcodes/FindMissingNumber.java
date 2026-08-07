package Leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
           findDisappearedNumbers(nums);


        }


    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int[] arr = new int[nums.length];
        List<Integer> list = new ArrayList<>();

        Arrays.fill(arr,0);


        for(int i = 0 ; i < nums.length ; i++)
        {
            arr[nums[i]-1] = 1;
        }

        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                list.add(i+1);
            }
        }



        return list;
    }
    }

