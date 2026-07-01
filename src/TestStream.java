import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );


        System.out.println(listOfLists.stream().flatMap(List::stream).filter(s -> s.endsWith("n")).map(String::toUpperCase).distinct().sorted().collect(Collectors.toList()));



    }
}
