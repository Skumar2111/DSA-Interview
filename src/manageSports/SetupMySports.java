package manageSports;

import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SetupMySports {

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);

        var executors = Executors.newFixedThreadPool(2);

        System.out.println("Enter sports you want to check details for :");

        String sports = scanner.nextLine();

        Class<?> singleObject = Class.forName("manageSports." + sports);

        try {
            Object createdSingle = singleObject.getConstructor().newInstance();
            List<String> myList = new ArrayList<>();

            Callable<?> callable = (() ->
            {
                Method[] methods = singleObject.getDeclaredMethods();

                Arrays.stream(methods).forEach((a) -> {
                    try {
                        String myResult = String.valueOf(a.invoke(createdSingle));
                        myList.add(myResult);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }


                });


                return myList;
            });

            Future<?> future = executors.submit(callable);
            System.out.println(future.get());


        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Closing executors");
        executors.shutdown();
    }

}
