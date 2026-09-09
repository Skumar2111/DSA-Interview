package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class DijkstraWithSet {

    public static void main(String[] args) {

        int[][] edges = {{0, 1, 2}, {0, 4, 1}, {4, 5, 4}, {4, 2, 2}, {1, 2, 3}, {2, 3, 6}, {5, 3, 1}};
        int e = edges.length;
        int vertices = 6;
        int source = 0 ;
        int[] result = dijkstras(edges,vertices,source);

        for(int res : result)
        {
            System.out.println(res);
        }



    }

    private static int[] dijkstras(int[][] edges, int vertices, int source) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] ed : edges) {

            int u = ed[0];
            int v = ed[1];
            int weight = ed[2];

            adj.get(u).add(new Pair(v, weight));
            adj.get(v).add(new Pair(u, weight));
        }


        TreeSet<Pair> treeSet = new TreeSet<>((a,b) -> a.weight - b.weight);

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        treeSet.add(new Pair(source, 0));

        while (!treeSet.isEmpty()) {
            Pair current = treeSet.pollFirst();

            int node = current.node;
            int dist = current.weight;

            for (Pair edge : adj.get(node)) {

                int adjNode = edge.node;
                int edgeWeight = edge.weight;

                int dis = dist + edgeWeight;

                if (dis < distance[adjNode]) {
                    // Remove old value from Set
                    if (distance[adjNode] != Integer.MAX_VALUE) {
                        treeSet.remove(
                                new Pair(adjNode, distance[adjNode])
                        );
                    }

                    // Update distance
                    distance[adjNode] = dis;

                    // Add new value
                    treeSet.add(
                            new Pair(adjNode, dis)
                    );
                }

            }

        }

        return distance;
    }
}
