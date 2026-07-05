package EmployeeManagement;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ManageEmployees {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Sushant","D1",32));
        employeeList.add(new Employee("Rahul","D1",22));
        employeeList.add(new Employee("Sudhir","C1",43));
        employeeList.add(new Employee("Sachin","RTB",23));
        employeeList.add(new Employee("Arvind","M-MAP",32));

        employeeList.stream().filter(dept -> dept.getDepartment().equals("D1")).collect(Collectors.toList()).forEach(System.out::println);

        Map<String,List<Employee>> hashMap = new HashMap<>();

        hashMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        /* Total number of departments */
        System.out.printf("Total number of Departments are %d \n",hashMap.size());

        hashMap.entrySet().stream().sorted();

        hashMap.entrySet().forEach(System.out::println);


        employeeList = employeeList.stream().filter(dept -> !dept.department.equals("RTB")).collect(Collectors.toList());

        System.out.println(employeeList);


        System.out.println("Employee with smallest emp id");
        employeeList = employeeList.stream().sorted(Comparator.comparingInt(a -> a.id)).collect(Collectors.toList());

        System.out.println(employeeList.get(0));

        employeeList = hashMap.entrySet().stream().flatMap(entry -> entry.getValue().stream()).collect(Collectors.toList());
        System.out.println(employeeList);

    }

}
