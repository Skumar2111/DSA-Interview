public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

        int start = 0;
        int end = array.length - 1;

        int number = 9;

        while (start <= end)
        {
            int mid = start + (end - start)/2;

            if(number == array[mid])
            {
                System.out.printf("Index for number is : %d" ,mid);
                return;
            }

            if(number > array[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

        }
        System.out.println("Not found");
    }
}
