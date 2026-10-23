package Stream;

import EmployeeManagement.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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










    }
}
