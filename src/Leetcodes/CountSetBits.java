package Leetcodes;

public class CountSetBits {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(hammingWeight(number));
    }


        public static int hammingWeight(int n) {

            int count = 0;

            while(n > 0)
            {
                n =  n & (n-1);
                count++;
            }

            return count;

        }
    }
