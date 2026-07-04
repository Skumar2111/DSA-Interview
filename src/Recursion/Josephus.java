package Recursion;

public class Josephus {


    public static void main(String[] args) {

        int n =5;
        int k = 3;

        int finalPerson = josephusExecution(n,k);
        System.out.println("Final person not being executed : " +finalPerson);
    }

    private static int josephusExecution(int n, int k) {

        if(n == 1)
        {
            return 0;
        }
        else
        {
            return (josephusExecution(n-1,k)+k)%n;
        }
    }
}
