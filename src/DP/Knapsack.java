package DP;

public class Knapsack {


    public static void main(String[] args) {

        int[] inputValue = {10,40,30,50};
        int[] weightValue = {5,4,6,3};

        int weight = 10;


       int calcKnapsack =  knapsack01(inputValue,weightValue,weight,inputValue.length);
        System.out.println(calcKnapsack);

    }

    private static int knapsack01(int[] inputValue, int[] weightValue, int weight, int n) {

        if(n == 0 || weight == 0)
        {
            return 0;
        }


        if(weightValue[n-1] > weight)
        {
            return knapsack01(inputValue,weightValue,weight,n-1);
        }
        else
        {
             return  Math.max(knapsack01(inputValue,weightValue,weight,n-1), weightValue[n-1] + knapsack01(inputValue,weightValue,weight-weightValue[n-1],n-1));
        }


    }
}
