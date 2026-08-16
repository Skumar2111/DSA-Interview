package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4};
        nextLargerElement(arr);
    }



        public static ArrayList<Integer> nextLargerElement(int[] arr) {
            // code here
            int n = arr.length;

            ArrayList<Integer> ans = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();

            for(int i = 0 ; i < n ; i++)
            {
                ans.add(-1);
            }

            for(int i = 0 ; i < n ; i++)
            {
                while(!stack.isEmpty() && arr[stack.peek()] < arr[i])
                {
                    ans.set(stack.pop(),arr[i]);
                }

                stack.push(i);
            }

            return ans;
        }
    }

