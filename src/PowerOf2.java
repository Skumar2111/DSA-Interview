public class PowerOf2 {

    public static void main(String[] args) {

        int number = 16;
        int count = 0;
        while(number > 0)
        {
            number &= (number - 1);
            count++;
        }

        if(count == 1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
