package COLL;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollection {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String[] names = {"Sushant", "Pooja", "Nishant", "Shalini", "ABC"};

        list.addAll(Arrays.asList(names));

        list.add("Happy");

        System.out.println(list);

        System.out.println("Check if list contains Happy :" + list.contains("Happy"));

        list.removeIf(name -> name.equals("ABC"));

        System.out.println("Check if list contains ABC :" + list.contains("ABC"));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);


        /*Linked List*/
        List<Integer> LList = new LinkedList<>();
        LList.add(10);
        LList.add(20);
        LList.add(30);
        LList.add(40);
        LList.add(50);

        Collections.reverse(LList);

        List<Integer> LList2 = new LinkedList<>();
        LList2.add(10);
        LList2.add(20);
        LList2.add(30);

        LList.retainAll(LList2);
        System.out.println("Printing Linked List : " + LList);


        /*Set*/

        Set<Integer> set = new LinkedHashSet<>();
        set.add(21);
        set.add(210);
        set.add(12);
        set.add(21);

        Collections.shuffle(list);
        System.out.println(set);

        System.out.println(list);


        Map<Integer, String> hMap = new HashMap<>();

        hMap.put(1, "One");
        hMap.put(2, "two");
        hMap.put(3, "three");
        hMap.put(null, "Zero");


        hMap.entrySet().stream().forEach(System.out::println);

        Set<Double> setLong = new HashSet<>();
        setLong = set.stream().map(a -> a.doubleValue()).collect(Collectors.toSet());
        set.stream().forEach(System.out::println);

        setLong.stream().forEach(System.out::println);


    }



}
