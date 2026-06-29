import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("alpha","bravo","charlie","delta"));

        for(String string : list)
        {
            System.out.println(string);
        }

        System.out.println("Using Lambda");

        list.stream().forEach(s -> System.out.println(s));

        System.out.println("----------------- >>>");

        list.stream().forEach((var s) ->
        {
            char firstAt = s.charAt(0);
            System.out.println(s+" means " +firstAt);
        });

    }
}
