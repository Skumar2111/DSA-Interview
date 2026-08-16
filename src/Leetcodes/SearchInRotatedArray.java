package Leetcodes;

public class SearchInRotatedArray {

    public static void main(String[] args) {

        int[] nums = {};
        int target = 0;
    }



        public static int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            while(low <= high)
            {
                int mid = (low + high) / 2;

                if(nums[mid] == target)
                {
                    return mid;
                }

                if(nums[low] <= nums[mid])
                {
                    if(nums[low] <= target && target < nums[mid])
                    {
                        high = mid - 1;
                    }
                    else
                    {
                        low = mid + 1;
                    }
                }
                else
                {
                    if(target < nums[mid] || target > nums[high])
                    {
                        high = mid -1;
                    }
                    else
                    {
                        low = mid + 1;
                    }
                }
            }

            return -1;
        }
    }

