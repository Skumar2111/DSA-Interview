package sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {38,27,43,39,9,82,10};
        int left = 0;
        int right = array.length -1;
        sorting(array,left,right);

        for(int i = 0 ; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

    }

    private static void sorting(int[] array, int left , int right) {

        if(left < right)
        {
            int mid = (left + right)/2;

            sorting(array,left,mid);
            sorting(array,mid+1,right);

            merge(array,left,mid,right);

        }

    }

    private static void merge(int[] array, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0 ; i < n1; ++i)
        {
            L[i] = array[left + i];
        }

        for(int j = 0; j < n2; ++j)
        {
            R[j] = array[mid+1+j];
        }

        int i = 0 , j = 0;

        int k = left;

        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                array[k] = L[i];
                i++;
            }
            else
            {
                array[k] = R[j];
                j++;
            }

            k++;
        }

        while(i <n1)
        {
            array[k] = L[i];
            i++;
            k++;
        }

        while(j < n2)
        {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
