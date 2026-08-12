package Leetcodes;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
* LeetCode - 347
* */
public class TopKFrequent {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        int[] res = new int[k];
        res = topKFrequent(nums,k);

        for(int i = 0 ; i < k ; i++)
        {
            System.out.println(res[i]);
        }

    }


        public static int[] topKFrequent(int[] nums, int k) {

            HashMap<Integer,Integer> hmap = new HashMap<>();


            int[] result = new int[k];

            for(int i = 0 ; i < nums.length ; i++)
            {
                if(hmap.containsKey(nums[i]))
                {
                    hmap.put(nums[i], hmap.get(nums[i])+1);
                }
                else
                {
                    hmap.put(nums[i],1);
                }
            }



            PriorityQueue<Map.Entry<Integer, Integer>> pq =
                    new PriorityQueue<>(
                            (a, b) -> a.getValue() - b.getValue()
                    );


            // 3. Keep only k most frequent elements
            for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {

                pq.offer(entry);

                if (pq.size() > k) {

                    for(int i = 0 ; i < k ; i++) {
                        result[i] = pq.poll().getKey();
                    }

                }



            }
            return result;
        }
    }


