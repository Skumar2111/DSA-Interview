import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NonRepeatingChar {

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++)
        {

            if(hmap.containsKey(s.charAt(i)))
            {
                hmap.put(s.charAt(i),hmap.get(s.charAt(i)+1));
            }
            else
            {
                hmap.put(s.charAt(i),1);
            }
        }


        Optional<Map.Entry<Character,Integer>> integer = hmap.entrySet().stream().filter(a -> a.getValue()==1).findFirst();

        System.out.println(integer.get().getKey());

    }
}
