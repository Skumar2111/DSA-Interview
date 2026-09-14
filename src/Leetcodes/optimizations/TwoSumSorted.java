package Leetcodes.optimizations;

public class TwoSumSorted {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int target = 9;
        int start = 0;
        int end = nums.length - 1;
        while(start < end)
        {
            int sum = nums[start] + nums[end];
            if(target == sum)
            {
                System.out.println(sum);
                break;
            }

            if(target > sum)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
    }
}
