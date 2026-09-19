package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 9, 8};
        int target = 7;

        int start = 0;
        int end = array.length - 1;

        System.out.println(binary(array, target, start, end));
    }

    private static int binary(int[] array, int target, int start, int end) {


        if (start <= end) {
            int mid = start + (end - start) / 2;

            if(target == array[mid])
            {
                return mid;
            }

            if (target < array[mid]) {
                end = mid - 1;
                return binary(array, target, start, end);
            } else {
                start = mid + 1;
                return binary(array, target, start, end);
            }


        }

        return -1;
    }
}