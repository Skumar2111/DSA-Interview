public class RecursionBasic {

    public static void main(String[] args) {

        int n = 5;
        printFunction(n);

    }

    private static void printFunction(int n) {
        if(n == 0)
        {
            return;
        }
        System.out.println("Printing " +n);
        printFunction(n-1);
        System.out.println("Printing " +n);

    }
}
