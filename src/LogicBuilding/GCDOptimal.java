package LogicBuilding;

public class GCDOptimal {

    public static void main(String[] args) {

        int a = 5 ;
        int b = 20;
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {

        if(b == 0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }

    }
}
