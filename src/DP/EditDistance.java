package DP;

public class EditDistance {


    public static void main(String[] args) {

        String input1 = "Saturday";
        String input2 = "Sunday";
        int m = input1.length();
        int n = input2.length();
        int min = editDistance(input1,input2,m,n);

        System.out.println(min);
    }

    private static int editDistance(String input1, String input2, int m, int n) {


        if(m == 0 ) {
            return n;
        }

        if(n == 0 )
        {
            return m;
        }


        if(input1.charAt(m-1) == input2.charAt(n-1))
        {
            return editDistance(input1,input2,m-1,n-1);
        }
        else
        {
           return 1 + Math.min(
            Math.min(editDistance(input1,input2,m,n-1),editDistance(input1,input2,m-1,n)),editDistance(input1,input2,m-1,n-1));
        }

    }
}
