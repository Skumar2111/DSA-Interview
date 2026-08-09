package Leetcodes;

public class MaximumWater {

    public static void main(String[] args) {

        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));

    }


    public static int maxArea(int[] height) {

        int left = 0, right = height.length - 1;
        int res = 0;

        while(left < right)
        {
            int water = Math.min(height[left] , height[right])*(right - left);

            res = Math.max(res, water);

            if(height[left] < height[right])
            {
                left += 1;
            }
            else
            {
                right -=1;
            }
        }

        return res;

    }
}


