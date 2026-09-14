package javaTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCheck {

    public static void main(String[] args) {

        String s = "abbcda";

        HashMap<String,Long> hashMap = Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        hashMap.entrySet().stream().filter(entry -> entry.getValue() > 1).findFirst().ifPresent(entry -> System.out.println(entry.getKey()));
    }
}
