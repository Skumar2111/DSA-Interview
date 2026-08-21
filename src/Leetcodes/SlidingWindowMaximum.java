package Leetcodes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/*
* 239. Sliding Window Maximum
* */
public class SlidingWindowMaximum {
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        maxSlidingWindow(nums, k);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dQueue = new ArrayDeque<>();

        int n = nums.length;
        for (int i = 0; i < k; i++) {
            while (!dQueue.isEmpty() && nums[i] >= nums[dQueue.peekLast()]) {
                dQueue.pollLast();
            }

            dQueue.addLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            res.add(nums[dQueue.peekFirst()]);

            while (!dQueue.isEmpty() && dQueue.peekFirst() <= i - k)
            {
                dQueue.pollFirst();
            }
                while (!dQueue.isEmpty() && nums[i] >= nums[dQueue.peekLast()]) {
                    dQueue.pollLast();
                }
                dQueue.addLast(i);



            }


            res.add(nums[dQueue.peekFirst()]);


            int[] arr = res.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

            return arr;

        }
    }






