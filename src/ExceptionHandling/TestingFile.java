package ExceptionHandling;

import java.io.*;
import java.util.Date;

public class TestingFile {

    public static void main(String[] args) throws IOException {


        try {
            BufferedReader br  = new BufferedReader(new FileReader("testing.txt"));

            String line;

            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        codeForWriting("file");

    }

    private static void codeForWriting(String file) throws IOException {



        try
        {
            Date date = new Date();
            BufferedWriter bw = new BufferedWriter(new FileWriter("testing.txt"));
            bw.write("Hey");
            bw.newLine();
            bw.write("Sushant");
            bw.newLine();
            bw.write("Sushant");
            bw.newLine();
            bw.write("==================================================");
            bw.newLine();
            bw.write(Long.toString(date.getTime()));


            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
