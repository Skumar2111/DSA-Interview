package LogicBuilding;

public class PowerOfNumber {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        System.out.println(calculatePower(a,b));
    }

    private static int calculatePower(int a, int b) {
        int temp;
        if(b == 0)
        {
            return 1;
        }

        temp = calculatePower(a, b/2);

        if(b % 2 == 0)
        {
            return temp * temp;
        }
        else
        {
            return a * temp * temp;
        }

    }
}
