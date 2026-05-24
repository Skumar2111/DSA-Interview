import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {

        int array[] = new int[]{16, 17, 4, 3, 5, 2};

        List<Integer> leaderList = new ArrayList<>();
        int max = array[array.length - 1];
        for(int i = array.length - 2; i > 0 ; i--)
        {
            if(array[i] > max)
            {
                leaderList.add(array[i]);
                max = array[i];
            }
        }

        leaderList.stream().forEach(System.out::println);
    }

}
