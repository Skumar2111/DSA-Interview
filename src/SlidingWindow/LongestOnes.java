package SlidingWindow;

public class LongestOnes {
    public static void main(String[] args) {
        int[] nums = {};
        longestOnes(nums,1);
    }
        public static int longestOnes(int[] nums, int k) {
            int start = 0;
            int end = 0;

            int zeros = 0;

            while(end < nums.length)
            {
                if(nums[end] == 0)
                {
                    zeros++;
                }
                end++;


                if(zeros > k)
                {
                    if(nums[start] == 0)
                    {
                        zeros --;
                    }
                    start++;
                }
            }

            return end - start;

        }
    }

