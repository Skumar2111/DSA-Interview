package sorting;

class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        sort012(arr);

        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void sort012(int[] arr) {
        // code here

        int n = arr.length;
        int low = 0 ;
        int mid = 0;
        int high  = n-1;

        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

    }
}