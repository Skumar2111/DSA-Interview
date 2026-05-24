import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int temp = 0;
        int i = 0 ,j = array.length - 1;

        while(i < j)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
