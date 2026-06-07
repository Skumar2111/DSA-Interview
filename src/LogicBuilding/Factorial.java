package LogicBuilding;

public class Factorial {

    public static void main(String[] args) {

        int number = 13;

        System.out.println(factorial(number));

    }

    private static int factorial(int number) {

        if (number == 0 || number == 1)
        {
            return 1;
        }
        return number * factorial(number -1);
    }
}
