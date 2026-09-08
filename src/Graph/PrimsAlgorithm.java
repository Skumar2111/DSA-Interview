package Graph;

import java.util.Arrays;

public class PrimsAlgorithm {
    final static int V = 5;
    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };


        primMST(graph);
    }

    public static int minKey(int key[] , boolean[] mstSet)
    {
        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for(int v = 0 ; v < V ; v++)
        {
            if(mstSet[v] == false && key[v] < min)
            {
                key[v] = min;
                min_index = v;
            }
        }

        return min_index;
    }

    public static void primMST(int[][] graph)
    {
        // Array to store constructed MST
        int parent[] = new int[V];

        int key[] = new int[V];

        boolean mstSet[] = new boolean[V];

        Arrays.fill(key,Integer.MAX_VALUE);

        // We need to include always first vertex
        key[0] = 0;
        parent[0] = -1;

        for(int count = 0 ; count < V-1 ; count++)
        {
            int u = minKey(key,mstSet);

            mstSet[u] = true;

            for(int v = 0 ; v < V ; v++)
            {
                if(graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v])
                {
                    parent[v] = u;
                    key[v] = graph[u][v];

                }
            }
            printMST(parent, graph);
        }
    }


    static void printMST(int parent[], int graph[][])
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }
}
