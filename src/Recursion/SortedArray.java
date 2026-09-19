package Recursion;

public class SortedArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        boolean result = isSorted(array,array.length);

        System.out.println(result);
    }

    private static boolean isSorted(int[] array,int size) {

        if(size == 0 || size == 1)
        {
            return true;
        }

        return array[size - 1] >= array[size - 2] && isSorted(array,size-1);
    }
}
