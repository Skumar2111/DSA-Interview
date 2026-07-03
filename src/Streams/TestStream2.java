package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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


        System.out.println(list.stream().map((number)-> number+(-5)).collect(Collectors.toList()));


        List<Integer> newOne = new ArrayList<>();
        newOne.add(10);
        newOne.add(20);
        newOne.add(30);
        newOne.add(21);

        System.out.println(newOne.stream().distinct().collect(Collectors.toList()));

        System.out.println(newOne.stream().limit(2).collect(Collectors.toList()));
        System.out.println(newOne.stream().limit(2).collect(Collectors.toList()));


        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i+1).
         filter(Character::isAlphabetic).filter(Character::isUpperCase)
                .filter(i -> Character.toUpperCase(i) < 'E')
                .skip(2)
        .forEach(d -> System.out.printf("%c ",d));


      //  Stream.generate(() -> random.ints(20,5,20)).sorted().forEach(System.out::println);


        var result = IntStream.iterate(0,i -> i  <=1000 , i -> i=i+21).summaryStatistics();
        System.out.println(result);


        var leapYear = IntStream.iterate(2000, i -> i <=2026 , i -> i += 1).filter(i -> i % 4 == 0).peek(System.out::println).max();
        System.out.println("Leap year details : "+leapYear);
    }
}
