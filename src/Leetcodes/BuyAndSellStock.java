package Leetcodes;

public class BuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0 ; i < prices.length ; i++)
        {
            min = Math.min(prices[i], min);
            max_profit = Math.max(max_profit,prices[i] - min);
        }
        return max_profit;

    }
}

