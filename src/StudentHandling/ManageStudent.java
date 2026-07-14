package StudentHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManageStudent {

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Susha\\Downloads\\student_registrations_1000.csv"));


            List<Student> students = bufferedReader.lines().skip(1).map(line -> {
                String[]  data = line.split(",");

                return new Student(
                        data[0],
                        data[1],
                        data[2],
                        data[3],
                        Date.valueOf(data[4]),
                        data[5],
                        data[6],
                        Integer.parseInt(data[7]),
                        data[8],
                        Date.valueOf(data[9]),
                        data[10]
                );

            }).collect(Collectors.toList());



            /*Sort by grade*/

            students.stream().sorted((s1,s2) -> s1.grade - s2.grade).forEach(System.out::println);


            /*Map by Class*/
            Map<Integer,List<Student>> hStudents = students.stream().collect(Collectors.groupingBy((a) -> a.grade));

            hStudents.entrySet().stream().forEach(System.out::println);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
