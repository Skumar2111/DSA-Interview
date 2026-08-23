package Stack;

import java.util.Stack;

public class TemperatureStack {

    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};
        dailyTemperatures(temp);

    }
            public static int[] dailyTemperatures(int[] temperatures) {

                int[] results = new int[temperatures.length];
                Stack<Integer> stack = new Stack<>();

                for(int i = 0 ; i < temperatures.length ; i++)
                {
                    while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i])
                    {
                        results[stack.peek()] = i - stack.pop();
                    }
                    stack.push(i);
                }

                return results;




            }
        }





