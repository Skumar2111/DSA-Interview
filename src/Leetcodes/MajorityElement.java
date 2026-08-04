package Leetcodes;

class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {3,2,3};
        int number = majorityElement(nums);

        System.out.println(number);


    }
    public static int majorityElement(int[] nums) {

        int count = 0;
        int element = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(count == 0)
            {
                element = nums[i];
                count ++;
            }
            else if (nums[i] == element)
            {
                count ++;
            }
            else
            {
                count--;
            }
        }


        int res = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == element)
            {
                res++;
            }
        }

        if(res > nums.length / 2) return element;
        else
            return -1;

    }
}
