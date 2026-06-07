package LogicBuilding;

public class CheckIfPrime {

    public static void main(String[] args) {

        int number = 4367;

        if(number <= 1)
        {
            System.out.println("Is Prime"+false);
        }

        for(int i = 2 ; i * i < number ; i++)
        {
            if(number % i == 0)
            {

                System.out.println("false");
                return;
            }
            else
            {
                System.out.println("true");
            }
        }

    }
}
