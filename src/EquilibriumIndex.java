/** Index for which left and right are equal */

public class EquilibriumIndex {

    public static void main(String[] args) {

        int[] arr = {-7,1,5,2,-4,3,0};
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += sum;
        }
        int leftSum = 0;

        for(int i = 0 ; i < arr.length - 1 ; i++)
        {
            sum -= arr[i];

            if(sum == leftSum)
            {
                System.out.println(i);
            }

            leftSum += arr[i];
        }

    }

}
