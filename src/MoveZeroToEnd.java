import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {

        int[] array = {1,2,3,0,4,5,0,6};

        int count = 0;

        for(int i = 0 ; i < array.length ; i++)
        {
            if(array[i] != 0)
            {
                array[count] = array[i];
                count++;
            }
        }

        for(int j = count ; j < array.length ; j++)
        {
            array[j] = 0;
        }


        Arrays.stream(array).forEach(System.out::println);
    }
}
