package Leetcodes;

import java.util.HashMap;
import java.util.Map;

/*LeetCode 560*/
public class SubArraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        int k = 3;
        subarraySum(nums,k);
    }
        public static int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> prefixSums = new HashMap<>();
            int res = 0;
            int currSum = 0;

            for(int i = 0 ; i < nums.length ; i++)
            {
                currSum += nums[i];

                if(currSum == k)
                {
                    res ++;
                }

                if (prefixSums.containsKey(currSum - k))
                {
                    res += prefixSums.get(currSum - k);
                }

                // Add currSum to the set of prefix sums.
                prefixSums.put(currSum, prefixSums.getOrDefault(currSum, 0) + 1);
            }

            return res;
        }
    }

