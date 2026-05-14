public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println(secondMax);

    }
}
