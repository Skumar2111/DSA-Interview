package LogicBuilding;

public class GCD {

    public static void main(String[] args) {
        int a = 98 ; int b = 56;

/*        while(a != b)
        {
            if( a > b)
            {
                a = a - b;
            }
            else
            {
                b = b -a;
            }

        }*/

        System.out.println(gcd(a,b));

    }

    private static int gcd(int a, int b) {

        if(b == 0)
        {
            return a;
        }

        return gcd(b, a %b);
    }
}
