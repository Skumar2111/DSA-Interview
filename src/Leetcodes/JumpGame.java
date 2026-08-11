package Leetcodes;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        canJump(arr);
    }
        public static boolean canJump(int[] nums) {
            int reachable = 0;

            for(int i = 0 ; i < nums.length ; i++)
            {
                if(i > reachable) return false;
                reachable = Math.max(reachable, i + nums[i]);
            }

            return true;
        }
    }

