package DP;

public class LISMain {

    public static void main(String[] args) {

        int[] arr = {3,4,2,8,10,5,1};

        int number = arr.length;
        int result = calculateLIS(arr,number);

        System.out.println(result);
    }

    private static int calculateLIS(int[] arr , int number) {

        int[] lis = new int[number];

        lis[0] = 1;

        for(int i = 1; i < number ; i++) {
            lis[i] = 1;
            for (int j = 0; j < number; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        int result = lis[0];

        for(int i = 0 ; i < lis.length ; i++)
        {
            result = Math.max(result,lis[i]);
        }

        return result;

    }
}
