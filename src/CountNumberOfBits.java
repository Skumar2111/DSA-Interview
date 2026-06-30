public class CountNumberOfBits {

    public static void main(String[] args) {

        int number = 4;
        int count = 0;

        while(number > 0)
        {
            number &= (number-1);
            count++;
        }
        System.out.println(count);

    }

}
