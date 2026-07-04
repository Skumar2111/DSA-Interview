package Recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {

        int n = 4;
        int from=1,to=3,aux=2;
        printTOH(n,from,to,aux);

    }

    private static void printTOH(int n, int from, int to, int aux) {

        if(n==1)
        {
            System.out.println("Move 1 from "+from+ " to " +to);
            return;
        }

        printTOH(n-1,from,aux,to);
        System.out.println("Move " +n+ " from " +from+ " to " +to);
        printTOH(n-1,aux,to,from);

    }

}
