package Graph;

import java.util.*;

public class ArticulationPoint {

    static int timer = 0;

    public static List<Integer> findArticulationPoints(
            int V, List<List<Integer>> adj) {

        int[] tin = new int[V];
        int[] low = new int[V];
        boolean[] visited = new boolean[V];
        boolean[] isArticulation = new boolean[V];
        timer = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, -1, adj, visited, tin, low, isArticulation);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (isArticulation[i]) {
                result.add(i);
            }
        }

        return result;
    }

    private static void dfs(
            int node,
            int parent,
            List<List<Integer>> adj,
            boolean[] visited,
            int[] tin,
            int[] low,
            boolean[] isArticulation) {

        visited[node] = true;
        tin[node] = low[node] = timer++;

        int children = 0;

        for (int neighbor : adj.get(node)) {

            if (neighbor == parent) {
                continue;
            }

            if (visited[neighbor]) {
                // Back edge
                low[node] = Math.min(low[node], tin[neighbor]);
            } else {
                // DFS tree edge
                dfs(neighbor, node, adj, visited,
                        tin, low, isArticulation);

                low[node] = Math.min(low[node], low[neighbor]);

                // Non-root articulation condition
                if (parent != -1 && low[neighbor] >= tin[node]) {
                    isArticulation[node] = true;
                }
                children++;
            }
        }

        // Root articulation condition
        if (parent == -1 && children > 1) {
            isArticulation[node] = true;
        }
    }

    public static void main(String[] args) {
        int V = 5;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0},
                {1, 3},
                {3, 4}
        };

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        System.out.println(findArticulationPoints(V, adj));
        // [1, 3]
    }
}