package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {

    public static void main(String[] args) {

        //input graph adj list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        //Prepare adjacency list for SCC//


        int vertices = 8;
        kosaraju(adj , vertices);
    }


    public static int kosaraju(ArrayList<ArrayList<Integer>> adj , int vertices)
    {
        int[] visited = new int[vertices];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < vertices ; i++)
        {
            if(visited[i] == 0)
            {
                dfs(i,visited,adj,stack);
            }
        }


        // reversing the adj. list for kosaraju algo

        ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();

        for(int i = 0 ; i < vertices ; i++)
        {
            adjT.add(new ArrayList<>());
        }

        for(int i = 0 ; i < vertices ; i++)
        {
            visited[i] = 0;
            for(Integer it : adj.get(i))
            {
                adjT.get(it).add(i);
            }
        }

        int scc = 0;

        while(!stack.isEmpty())
        {
            int node = stack.peek();
            stack.pop();
            if(visited[node] == 0)
            {
                scc++;
                dfs2(node,visited,adjT);

            }

        }

        return scc;

    }

    private static void dfs2(int node, int[] visited, ArrayList<ArrayList<Integer>> adjT) {

        visited[node] = 1;
        for(Integer it : adjT.get(node))
        {
            if(visited[it] == 0)
            {
                dfs2(it,visited,adjT);
            }
        }



    }

    private static void dfs(int node, int[] visited, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack) {

        visited[node] = 1;

        for(Integer it : adj.get(node))
        {
            if(visited[it] == 0)
            {
                dfs(it,visited,adj,stack);
            }
        }

        stack.push(node);
    }
}
