package Leetcodes.BinarySearch;

public class MinInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,6,7};
        System.out.println(findMin(nums));
    }
        public static int findMin(int[] nums) {
            int low = 0;
            int high = nums.length - 1;

            while(low < high)
            {
                if(nums[low] < nums[high])
                {
                    return nums[low];
                }

                int mid = low + (high - low) / 2;
                if(nums[mid] > nums[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid;
                }
            }
            return nums[low];

        }
    }

