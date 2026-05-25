public class StockBuySell {
    public static void main(String[] args) {

        int[] array = {100, 180, 260, 310, 40, 535, 695};
        int max_profit = 0;

        for(int i = 1 ; i < array.length ; i++)
        {
            if(array[i] > array[i-1])
            {
                max_profit += array[i] - array[i-1];
            }

        }

        System.out.println(max_profit);


    }
}
