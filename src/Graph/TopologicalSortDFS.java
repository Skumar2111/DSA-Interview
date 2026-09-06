package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalSortDFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int vertices = 5;

        for(int i = 0 ; i < vertices ; i++)
        {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,3,4);

        Stack<Integer> stack = DFS(adj,0,vertices);

        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u , int v)
    {
        adj.get(u).add(v);
    }


    public static Stack<Integer> DFS(ArrayList<ArrayList<Integer>> adj, int source, int vertices)
    {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < vertices ; i++)
        {
            if(!visited[i])
            {
                DFSRec(adj ,i,stack, visited);
            }
        }
        return stack;
    }


    public static void DFSRec(ArrayList<ArrayList<Integer>> adj , int node , Stack<Integer> stack , boolean[] visited) {
        visited[node] = true;
        for(int v : adj.get(node))
        {
            if(!visited[v])
            {
                DFSRec(adj,v,stack,visited);
            }
        }
        stack.push(node);
    }


}
