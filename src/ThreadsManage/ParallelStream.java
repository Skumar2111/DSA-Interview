package ThreadsManage;

import java.util.Comparator;
import java.util.Random;
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


        Stream.generate(Person::new).limit(100).parallel().sorted(Comparator.comparing(Person::lastName)).forEach(System.out::println);
    }
}
