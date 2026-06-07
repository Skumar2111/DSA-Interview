package LogicBuilding;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {

        int number = 543;

        System.out.println(sumOfInt(number));

    }
    private static int sumOfInt(int number) {

        if(number == 0)
        {
            return 0;
        }
       return  (number % 10)  + sumOfInt(number/10);
    }


}
