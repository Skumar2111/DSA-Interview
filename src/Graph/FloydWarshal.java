package Graph;

public class FloydWarshal {

    public static void main(String[] args) {

        int vertices = 5;
        int[][] graph = new int[vertices][vertices];


        floydAlgo(graph);

    }

    private static int[][] floydAlgo(int[][] graph) {
        int n = graph.length;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(graph[i][j] == -1)
                {
                    graph[i][j] = Integer.MAX_VALUE;
                }

                if(i == j) graph[i][j] = 0;
            }
        }



        for(int k = 0 ; k < n ; k++)
        {
            for(int i = 0 ; i < n ;i++)
            {
                for(int j =0 ; j < n ;j++)
                {
                    graph[i][j] = Math.min(graph[i][j],(graph[i][k]+ graph[k][j]));
                }
            }
        }

        return graph;
    }
}
