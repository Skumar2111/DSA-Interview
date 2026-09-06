package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
* Topological Sort and Relaxation of distance
* */

public class ShortestPathDAG
{
    public static void main(String[] args) {
        int[][] edges = {{0,1,2}, {0,4,1}, {4,5,4}, {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}};
        int e = edges.length;
        int vertices = 6;
        int[] distance = findDistance(vertices,e,edges);
        for(int i = 0 ; i < distance.length ; i++)
        {
            System.out.println(distance[i]);
        }
    }

    private static int[] findDistance(int vertices, int e, int[][] edges) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0 ; i < vertices ; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] ed : edges)
        {
            adj.get(ed[0]).add(new Pair(ed[1],ed[2]));
        }
        int[] visited = new int[vertices];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < vertices ; i++)
        {
            if(visited[i] == 0)
            {
                dfs(i,visited,stack,adj);
            }
        }
        int[] distance = new int[vertices];
        for(int i = 0 ; i < vertices ; i++) distance[i] = Integer.MAX_VALUE;
        distance[0] = 0;
        while(!stack.isEmpty())
        {
            int data = stack.pop();
            if(distance[data] != Integer.MAX_VALUE)
            {
                for(Pair pair : adj.get(data))
                {
                    if(distance[data] + pair.weight < distance[pair.node])
                    {
                        distance[pair.node] = distance[data] + pair.weight;
                    }
                }
            }
        }
        return distance;
    }

    private static void dfs(int source, int[] visited, Stack<Integer> stack, List<List<Pair>> adj) {
        visited[source] = 1;
        for(Pair pair : adj.get(source))
        {
            if(visited[pair.node] == 0)
            {
                dfs(pair.node,visited,stack,adj);
            }
        }
        stack.push(source);
    }
}

class Pair
{
    int node , weight;
    public Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}
