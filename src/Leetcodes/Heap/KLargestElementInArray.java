package Leetcodes.Heap;

import java.util.PriorityQueue;

/*LeetCOde 215*/
public class KLargestElementInArray {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        findKthLargest(nums,k);
    }




        public static int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

            int n = nums.length;

            for(int i = 0 ; i < n ; i++)
            {
                pq.add(nums[i]);
            }

            int f = k-1;

            while(f > 0)
            {
                pq.remove();
                f--;
            }

            return pq.peek();
        }
    }

