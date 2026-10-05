import java.util.ArrayList;
import java.util.List;

class SolutionK {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {


        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            int value = Math.abs(nums[i]);
            nums[value - 1] = -Math.abs(nums[value - 1]);
        }

        for(int i = 0 ; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                list.add(i+1);
            }
        }



        return list;
    }
}