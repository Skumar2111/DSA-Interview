package Graph;

public class FloodFillAlgorithm {

    public static void main(String[] args) {

        int source_row = 3;
        int source_column = 3;
        int[][] matrix = {{1,1,1},{2,2,0},{2,2,2}};
        int new_colour = 3;
        int initial_row = 2;
        int initial_column = 0;


        int[][] result = floodFill(matrix,new_colour,initial_row,initial_column);

        for(int i = 0 ; i < result.length ; i++)
        {
            System.out.println();
            for(int j = 0 ; j < result[0].length ; j++)
            {
                System.out.print(" "+result[i][j]);
            }
        }


    }

    private static int[][] floodFill(int[][] matrix, int newColour,int initial_row , int initial_column) {

        int[][] ans_matrix = matrix;
        int colour = matrix[initial_row][initial_column];

        int[] delta_row = {-1,0,+1,0};
        int[] delta_column = {0,+1,0,-1};

        dfs(initial_row, initial_column , matrix , ans_matrix , colour , newColour ,delta_row , delta_column);

        return ans_matrix;
    }

    private static void dfs(int initialRow, int initialColumn, int[][] matrix, int[][] ansMatrix, int colour, int newColour, int[] deltaRow, int[] deltaColumn) {


        ansMatrix[initialRow][initialColumn] = newColour;

        int actual_row = matrix.length;
        int actual_column = matrix[0].length;

        for(int delta = 0 ; delta < 4 ; delta++)
        {
            int new_row = initialRow + deltaRow[delta];
            int new_column = initialColumn + deltaColumn[delta];

            if(new_row >= 0 && new_row < actual_row && new_column >= 0 && new_column < actual_column
            && matrix[new_row][new_column] == colour && ansMatrix[new_row][new_column] != newColour)

            {
                dfs(new_row,new_column,matrix,ansMatrix,colour,newColour,deltaRow,deltaColumn);
            }

        }
    }
}
