package Leetcodes;

public class BS {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 1;
        searchInsert(nums,target);
    }

        public static   int searchInsert(int[] nums, int target) {

            int start = 0;
            int end = nums.length - 1;
            int mid = 0;

            while (start < end) {
                mid = (start) + (end - start) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

            if (target > nums[end]) {
                return end + 1;
            } else if (target < start) {
                return mid - 1;
            }
            return mid;
        }
}
