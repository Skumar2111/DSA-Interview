package Recursion;

public class RopeCut {

    public static void main(String[] args) {
        int rope_length = 23;
        int a = 12;
        int b = 9;
        int c = 11;

        System.out.println(calculateSum(rope_length,a,b,c));
    }

    private static int calculateSum(int rope_length, int a, int b, int c) {

        if(rope_length == 0)
        {
            return 0;
        }

        if(rope_length < 0)
        {
            return -1;
        }

        int max_a_b = Math.max(calculateSum(rope_length-a,a,b,c),calculateSum(rope_length-b,a,b,c));
        int max_c = Math.max(max_a_b,calculateSum(rope_length-c,a,b,c));

        if(max_c == -1)
        {
            return -1;
        }
        return max_c+1;
    }
}
