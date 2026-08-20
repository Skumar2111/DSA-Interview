package Leetcodes.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElement {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }




    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int n = nums.length;

        for(int i = 0 ; i < n ; i++)
        {
            pq.add(nums[i]);

            if(pq.size() > k)
            {
                pq.poll();
            }
        }

        return pq.peek();
    }
}

