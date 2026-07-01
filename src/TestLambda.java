import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestLambda {

    public static void main(String[] args) {

        /*Predicate*/
        Predicate<Integer> predicate = (n -> n%2 == 0);
        System.out.println(predicate.test(20));

        /*consumer*/
        Consumer<Integer> consumer = (a) -> System.out.println(a);
        consumer.accept(15);

        /*Supplier*/
        Supplier<Integer> listSupplier = () ->
        {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println(listSupplier.get());

    }
}
