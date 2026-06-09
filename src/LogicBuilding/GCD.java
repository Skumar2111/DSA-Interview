package LogicBuilding;

public class GCD {

    public static void main(String[] args) {
        int a = 5 ; int b = 10;

        while(a != b)
        {
            if( a > b)
            {
                a = a - b;
            }
            else
            {
                b = b -a;
            }

        }

        System.out.println(a);
    }
}
