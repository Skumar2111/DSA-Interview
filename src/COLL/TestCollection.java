package COLL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] names = {"Sushant","Pooja", "Nishant", "Shalini", "ABC"};

        list.addAll(Arrays.asList(names));

        list.add("Happy");

        System.out.println(list);

        System.out.println("Check if list contains Happy :" +list.contains("Happy"));

        list.removeIf(name -> name.equals("ABC"));

        System.out.println("Check if list contains ABC :" +list.contains("ABC"));

        System.out.println(list);

    }



}
