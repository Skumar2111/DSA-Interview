package Stream;

import EmployeeManagement.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckStreams {

    public static void main(String[] args) {

        Random random = new Random();
        List<Employees> listEmployees = random.ints(20,1,100).mapToObj(
                id -> new Employees(id, random.nextInt(5000))).collect(Collectors.toList());



        /* sort with salaries*/
        listEmployees.sort(new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o1.salary - o2.salary;
            }
        });




        // Post Lambda

        listEmployees.sort((a,b) -> Integer.compare(a.salary,b.salary));


        listEmployees.removeIf(e -> e.salary > 1000);

        System.out.println(listEmployees);

        Predicate<Boolean> predicate = (a) -> listEmployees.size() <= 5;

        System.out.println(predicate.test(true));


        Consumer<List<Employees>> consumer = (list) -> list.stream().forEach(System.out::println);

        consumer.accept(listEmployees);


        int[] arr = {1,2,3,4,5,6,7,8,9,43};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

       List<Integer> newList = list.stream().filter(a -> a > 10).collect(Collectors.toList());

       // source -> From where we get the data
       Stream<Double> randomNumber = Stream.generate(Math::random);

       randomNumber.limit(10).forEach(System.out::println);

       Random random1 = new Random();

       Stream<Integer> number = Stream.generate(() -> random1.nextInt(100));

       number.limit(10).forEach(System.out::println);


       Stream<Integer> numbers = Stream.iterate(1,n -> n+1);

       numbers.limit(10).forEach(System.out::println);


        IntStream.range(20,30).map((n) -> n/2).forEach(System.out::println);

        // Intermediate returns other stream based on the operations



        // Trigger processing and produces the result


       newList.forEach(System.out::println);


















    }
}
