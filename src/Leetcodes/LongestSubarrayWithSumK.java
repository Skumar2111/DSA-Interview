package Leetcodes;

import java.util.HashMap;

public class LongestSubarrayWithSumK {

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 3;

        longestSubarray(arr,k);


    }

        public static int longestSubarray(int[] arr, int k) {
            // code here
            HashMap<Integer,Integer> hashMap = new HashMap<>();

            int n = arr.length;
            int sum = 0;
            int max = 0;


            for(int i = 0 ; i < arr.length ; i++)
            {
                sum += arr[i];

                if(sum == k)
                {
                    max = i + 1;
                }

                if(hashMap.containsKey(sum - k))
                {
                    max = Math.max(max,i-hashMap.get(sum - k));

                }

                if(!hashMap.containsKey(sum))
                {
                    hashMap.put(sum,i);
                }
            }

            return max;
        }
    }


