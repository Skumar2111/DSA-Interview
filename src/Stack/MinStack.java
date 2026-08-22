package Stack;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {

        int[] nums = {};



        minStack(nums);

    }

    private static void minStack(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        int value = 15;
        if(minStack.isEmpty())
        {
            stack.push(value);
            minStack.push(value);
        }
        else
        {
            minStack.push(Math.min(value,minStack.peek()));
        }

    }


}
