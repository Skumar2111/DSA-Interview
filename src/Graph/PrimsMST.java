package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsMST {

    public static void main(String[] args) {

        int[][] edges = {{0, 1, 2}, {0, 4, 1}, {4, 5, 4}, {4, 2, 2}, {1, 2, 3}, {2, 3, 6}, {5, 3, 1}};
        int e = edges.length;
        int vertices = 6;

        int result = findMST(edges, vertices);

        System.out.println(result);

    }

 /*   private static int findMST(int[][] edges, int vertices) {

        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0 ; i < vertices ; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] ed : edges)
        {
            adj.get(ed[0]).add(new Pair(ed[1],ed[2]));
            adj.get(ed[1]).add(new Pair(ed[0], ed[2]));
        }
        int[] visited = new int[vertices+1];


        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((x,y) -> x.weight - y.weight);

        priorityQueue.add(new Pair(0,0));

        int sum = 0 ;

        while(priorityQueue.size() > 0)
        {
            int weight = priorityQueue.peek().weight;
            int node = priorityQueue.peek().node;

            priorityQueue.poll();

            if(visited[node] ==1) continue;

            visited[node] = 1;

            sum += weight;

            for(int i = 0 ; i < adj.get(node).size() ; i++)
            {
                int edw = adj.get(node).get(i).weight;
                int adjNode = adj.get(node).get(i).node;

                if(visited[adjNode] == 0)
                {
                    priorityQueue.add(new Pair(edw,adjNode));
                }
            }



        }

        return sum;
    }*/


    private static int findMST(int[][] edges, int vertices) {

        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected graph
        for (int[] ed : edges) {

            int u = ed[0];
            int v = ed[1];
            int weight = ed[2];

            adj.get(u).add(new Pair(v, weight));
            adj.get(v).add(new Pair(u, weight));
        }

        boolean[] visited = new boolean[vertices];

        PriorityQueue<Pair> priorityQueue =
                new PriorityQueue<>((x, y) -> x.weight - y.weight);

        // Pair(weight, node)
        priorityQueue.add(new Pair(0, 0));

        int sum = 0;

        while (!priorityQueue.isEmpty()) {

            Pair current = priorityQueue.poll();

            int weight = current.weight;
            int node = current.node;

            if (visited[node]) {
                continue;
            }

            visited[node] = true;

            sum += weight;

            for (Pair edge : adj.get(node)) {

                int adjNode = edge.node;
                int edgeWeight = edge.weight;

                if (!visited[adjNode]) {
                    priorityQueue.add(
                            new Pair(adjNode,edgeWeight)
                    );
                }
            }
        }

        return sum;
    }
}


