package Leetcodes;

/*
* LeetCode - 162
* */
public class FindPeakElement {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }



        public static int findPeakElement(int[] nums) {

            int low = 0;
            int high = nums.length - 1;

            while (low < high) {

                int mid = low + (high - low) / 2;

                if (nums[mid] < nums[mid + 1]) {
                    // We are on an increasing slope.
                    // A peak must exist on the right.
                    low = mid + 1;
                }
                else {
                    // We are on a decreasing slope.
                    // A peak exists at mid or on the left.
                    high = mid;
                }
            }

            return low;
        }
    }

