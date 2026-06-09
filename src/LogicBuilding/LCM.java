package LogicBuilding;

public class LCM {

    public static void main(String[] args) {
        int  a = 5 ; int b = 10;

        int lcm = (a * b) / gcd(a,b);

        System.out.println(lcm);
    }

    private static int gcd(int a, int b) {

        if(b == 0)
        {
            return a;
        }
        else
        {
            return gcd(b, a%b);
        }
    }
}
