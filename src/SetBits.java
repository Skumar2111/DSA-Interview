public class SetBits {

    public static void main(String[] args) {

        int number = 5;
        int k = 2;

        // to check if kth bit set

        int kComp = (1 << k-1);

        if((number & kComp) != 0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
