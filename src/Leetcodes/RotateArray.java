package Leetcodes;

public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        int[] result = rotate(nums,k);

        for(int i = 0 ; i < result.length ; i++) {

            System.out.println(result[i]);
        }

    }
        public static int[] rotate(int[] nums, int k) {

            int[] result = new int[nums.length];

            for(int i = 0 ; i < nums.length ; i++)
            {
                result[i] = nums[(i+k)%nums.length];
            }

return result;

        }
    }

