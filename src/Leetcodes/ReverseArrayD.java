package Leetcodes;

/*
* Left rotate by 189
* */
public class ReverseArrayD {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int k = 3;
        rotate(nums,k);

    }

        public static void rotate(int[] nums, int k) {

            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
            reverse(nums,0,nums.length - 1);



        }

        public static void reverse(int[] arr , int start , int end)
        {
            if(start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

