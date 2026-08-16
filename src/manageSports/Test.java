package manageSports;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String str;
        String s = "A man, a plan, a canal: Panama";

        str = s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str);


        HashMap<Integer,Integer> hash = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry : hash.entrySet())
        {
            entry.getValue();


        }
    }
}
