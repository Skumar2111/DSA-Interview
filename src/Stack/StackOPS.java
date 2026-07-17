package Stack;

import java.util.Stack;

public class StackOPS {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(50);

        while (!stack.isEmpty())
        {
            int poppedInt = stack.pop();
            System.out.println("Processing Last popped Integer : . . . . ." +poppedInt);

        }

    }
}
