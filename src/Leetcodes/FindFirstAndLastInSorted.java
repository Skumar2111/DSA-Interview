package Leetcodes;

public class FindFirstAndLastInSorted {

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        searchRange(nums,target);
    }



    public static int[] searchRange(int[] nums, int target) {
        return new int[]{
                first(nums, target), last(nums, target)
        };
    }
    private static int first(int[] nums, int target) {
        int left = 0, right = nums.length - 1, res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target)
                    res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    private static int last(int[] nums, int target) {
        int left = 0, right = nums.length - 1, res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target)
                    res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}


