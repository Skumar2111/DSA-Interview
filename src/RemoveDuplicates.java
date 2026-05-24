import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] array = {1,2 ,2, 3, 4, 4};

        int prev = array[0];
        int block = 1;

        for (int i = 1; i < array.length; i++)
        {
            if(prev != array[i])
            {
               array[block] = array[i];
               prev = array[i];
               block++;
            }
            else
            {
                array[i] = 0;
            }
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
