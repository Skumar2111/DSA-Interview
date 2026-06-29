public class SetUnset {

    public static void main(String[] args) {

        int number = 75;
        int k = 1;

        if((number & ( 1 << k))!= 0)
        {
            System.out.println("SET");
        }
        else
        {
            System.out.println("UNSET");
        }

    }
}
