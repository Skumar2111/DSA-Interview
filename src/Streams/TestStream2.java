package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestStream2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        List<Integer> finalList = list;
        Supplier<List<Integer>> supplier =  () -> {
            int i = 0;
            while(i < 10)
            {
                finalList.add(random.nextInt(100));
                i++;
            }
        return finalList;
        };


        System.out.println("Numbers from Supplier");
        System.out.println(supplier.get());


        System.out.println("Filter Odd numbers");
        List<Integer> oddList = new ArrayList<>();
        oddList = list.stream().filter((number) -> number%2!=0).collect(Collectors.toList());
        oddList.stream().forEach(System.out::println);


        System.out.println("Filter Odd numbers");
        List<Integer> evenList = new ArrayList<>();
        evenList = list.stream().filter((number) -> number%2==0).collect(Collectors.toList());
        evenList.stream().forEach(System.out::println);


        System.out.println("Total elements");
        System.out.println(list.stream().count());

        System.out.println("Total Sum");
        System.out.println(list.stream().reduce(0,Integer::sum));

        System.out.println("Average");
        System.out.println(list.stream().mapToInt(Integer::intValue).average().orElse(0.0));
    }
}
