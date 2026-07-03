package Recursion;

public class SubSets {

    public static void main(String[] args) {

        String string = "abc";
        String current= "";
        int i = 0;
        generateSubSet(string,current,i);

    }

    private static void generateSubSet(String string, String current, int i) {

        if(i == string.length())
        {
            System.out.println(current);
            return;
        }

        generateSubSet(string,current,i+1);
        generateSubSet(string,current+string.charAt(i),i+1);


    }
}
