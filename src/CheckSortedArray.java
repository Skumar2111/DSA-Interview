public class CheckSortedArray {

    public static void main(String[] args) {
        int[] array = {1,3,2,5,6};

        boolean isSorted = true;

        for(int i = 1 ; i < array.length-1 ; i++)
        {
                if(array[i] < array[i+1]) {

                    isSorted = false;

                }
                }
        System.out.println(isSorted);
    }


    }

