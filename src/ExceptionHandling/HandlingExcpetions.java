package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class HandlingExcpetions {

    public static void main(String[] args)
    {
        String fileName = "testing.csv";
        Path path = Paths.get(fileName);

        try {
            List<String> list = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        testFile(path);
    }

    private static void testFile(Path path) {


        try (FileReader reader = new FileReader(path.getFileName().toString()))
        {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
