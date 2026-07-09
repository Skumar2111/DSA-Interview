import java.util.HashMap;

public class TwoPair {

    public static void main(String[] args) {

        int [] array = {1, 5, 3, 4, 3, 5, 6};

        HashMap<Integer,Integer> hMap = new HashMap<>();

        for(int i = 0 ; i < array.length; i++)
        {
            if(hMap.containsKey(array[i]))
            {
                System.out.println(hMap.get(array[i]));
                return;
            }
            else
            {
                hMap.put(array[i],i);
            }
        }
        System.out.println("Not found");
        return;
    }
}
