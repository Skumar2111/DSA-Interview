package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestingFile {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("./testing.txt"));


            while(br.readLine() != null)
            {
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
