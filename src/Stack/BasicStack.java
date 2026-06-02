package Stack;

import java.util.Stack;

public class BasicStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);


        printStack(stack);
    }

    private static void printStack(Stack<Integer> stack) {

        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }

    }
}
