package ThreadsManage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

record Person(String firstName, String lastName, int age)
{
    private final static String[] firsts = {
                    "Hari","Harish","Sushant","Amit","Akash"
            };

    private final static String[] lasts = {
            "Kumar","Singh","Any"
    };

    private static final Random random = new Random();

    public Person() {
        this(firsts[random.nextInt(firsts.length)],
        lasts[random.nextInt(lasts.length)], random.nextInt(18,100));
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ParallelStream {
    public static void main(String[] args) {


        Stream.generate(Person::new).limit(100).parallel().sorted(Comparator.comparing(Person::lastName)).forEachOrdered(System.out::println);



        int sumWithoutParallel = IntStream.range(0,1000).sum();
        System.out.println("Sum without parallel "+sumWithoutParallel);

        int sumWithParallel = IntStream.range(0,1000).parallel().reduce(0,Integer::sum);
        System.out.println("Sum with parallel "+sumWithParallel);

        Map<String, Long> lastNameCount = Collections.synchronizedMap(new HashMap<>());

        lastNameCount = Stream.generate(Person::new).limit(10000).parallel().collect(Collectors.groupingByConcurrent(Person::firstName,Collectors.counting()));


        lastNameCount.entrySet().stream().forEach(System.out::println);

        System.out.println(lastNameCount.getClass().getName());



    }
}
