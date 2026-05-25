/*Complement*/

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < array.length ; i++)
        {
            int complement = target - array[i];

            if(map.containsKey(complement))
            {
                System.out.println(map.get(complement)+""+ i);
            }
            map.put(array[i], i);
        }
    }
}
