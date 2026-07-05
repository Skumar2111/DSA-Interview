package Stack;

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {

        int[] stocks = {60,10,20,15,35,50};

        stockSpan(stocks);

    }

    private static void stockSpan(int[] stocks) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.println(1);

        int span;
        for(int i = 1 ; i < stocks.length ; i++)
        {
            while(!stack.isEmpty() && stocks[stack.peek()] <= stocks[i])
            {
                stack.pop();
            }

            span = stack.isEmpty()?i+1:i - stack.peek();

            System.out.println(span);

            stack.push(i);

        }
    }
}
