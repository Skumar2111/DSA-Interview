public class RangeSum {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int[] prefixSum = new int[5];
        prefixSum[0] = array[0];
        for(int i = 1 ; i < array.length-1 ; i++)
        {
            prefixSum[i] = prefixSum[i-1] + array[i];
        }
        for (int i = 0 ; i < prefixSum.length ; i++) {

            System.out.println(prefixSum[i]);
        }
    }
}
