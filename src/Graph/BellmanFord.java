package Graph;

import java.util.Arrays;

/*
* In Bellman ford we use {u,v,weight}
*
* To check the cycle we need to do one more iteration
*
* for(ArrayList<integer> it : edges
* {
* int u = it.get(0);
* int v= it.get(1);
* int wt  = it.get(2);
* if(distance(u) != INF && distance[u] + wt < distance[v]
* {
* int temp = new int[1];
* temp[0] = -1;
* return temp;
* }
*
* V * E time complexity - graph has -ve cycle
* */

public class BellmanFord {

    public static void main(String[] args) {

        int[][] edges = {
                {0, 1, 2},
                {0, 4, 1},
                {4, 5, 4},
                {4, 2, 2},
                {1, 2, 3},
                {2, 3, 6},
                {5, 3, 1}
        };

        int vertices = 6;
        int source = 0;

        bellman(edges, vertices, source);
    }

    private static void bellman(int[][] edges, int vertices, int source) {

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        // Relax every edge V - 1 times
        for (int i = 0; i < vertices - 1; i++) {

            for (int[] edge : edges) {

                int u = edge[0];
                int v = edge[1];
                int weight = edge[2];

                // Relaxation
                if (distance[u] != Integer.MAX_VALUE &&
                        distance[u] + weight < distance[v]) {

                    distance[v] = distance[u] + weight;
                }
            }
        }

        System.out.println(Arrays.toString(distance));
    }
}