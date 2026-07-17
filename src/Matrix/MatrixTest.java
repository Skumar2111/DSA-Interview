package Matrix;

public class MatrixTest
{
    public static void main(String[] args) {

        int[][] matrix = new int[3][5];

        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 5; j++)
            {
                matrix[i][j] = i * i;
            }
        }


        for(int i = 0 ; i < 3; i++)
        {
            for(int j = 0 ;  j < 5 ; j++)
            {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println("\n");
        }

    }
}
