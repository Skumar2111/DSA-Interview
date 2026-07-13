package DSA;

public class SecondLargest {

    public static void main(String[] args) {

       int[] arr = {10, 5, 10};

       findSecondLargest(arr);

    }

    private static void findSecondLargest(int[] arr) {

        int max = arr[0];
        int second_max = 0;

        for(int i = 1 ; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                second_max = max;
                max = arr[i];

            }
            else if(arr[i] > second_max && arr[i] < max)
            {
                second_max = arr[i];
            }

        }

        System.out.println(second_max);

    }
}
