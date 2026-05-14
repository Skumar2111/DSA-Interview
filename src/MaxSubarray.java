public class MaxSubarray {

    public static void main(String[] args) {
        int[] arr = {-3,4,-1,-2,1,5};

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            currentSum += arr[i];

            if( currentSum > maxSum)
            {
                maxSum = currentSum;
            }

            if(currentSum < 0)
            {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);


    }
}
