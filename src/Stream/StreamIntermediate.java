package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediate {

    public static void main(String[] args) {

        List<Integer> number = List.of(1,2,3,4,5,6,78,8,7);

        List<Integer> result = number.stream().filter(a -> a % 2 != 0).map(a -> a+1).toList();

        result.stream().skip(1).forEach(System.out::println);

        result.stream().mapToInt(a -> a*5).boxed().collect(Collectors.toList());

        result.stream().forEach(System.out::println);

        result.stream().max(Integer::compareTo);

    }
}
