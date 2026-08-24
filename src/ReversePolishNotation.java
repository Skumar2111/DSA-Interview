import java.util.Stack;


/*LeetCode - 150*/
public class ReversePolishNotation {


    public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"};

        evalRPN(tokens);

    }

        public static int evalRPN(String[] tokens) {

            Stack<String> stack = new Stack<String>();
            int x, y;
            String result = "";
            int get = 0;
            String choice;
            int value = 0;
            String p = "";

            for(int i = 0 ; i < tokens.length ; i++)
            {
                if(tokens[i].matches("-?\\d+"))
                {
                    stack.push(tokens[i]);
                    continue;
                }
                else
                {
                    choice = tokens[i];
                }

                switch (choice) {
                    case "+":

                        // Performing the "+" operation by popping
                        // put the first two character
                        // and then again store back to the stack

                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        value = x + y;
                        result = p + value;
                        stack.push(result);
                        break;

                    case "-":

                        // Performing the "-" operation by popping
                        // put the first two character
                        // and then again store back to the stack
                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        value = y - x;
                        result = p + value;
                        stack.push(result);
                        break;

                    case "*":

                        // Performing the "*" operation
                        // by popping put the first two character
                        // and then again store back to the stack

                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        value = x * y;
                        result = p + value;
                        stack.push(result);
                        break;

                    case "/":

                        // Performing the "/" operation by popping
                        // put the first two character
                        // and then again store back to the stack

                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        value = y / x;
                        result = p + value;
                        stack.push(result);
                        break;

                    default:
                        continue;
                }
            }

            return Integer.parseInt(stack.pop());
        }

    }


