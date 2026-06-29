/**---- A number is power of 2 if Bitwise & of (N) and (N-1) will be "0" ---*/

public class PowerOfTwo {

    public static void main(String[] args) {

        int x = 16;

        int isPowerOfTwo = x & (x-1);
        System.out.println(isPowerOfTwo == 0);

    }
}
