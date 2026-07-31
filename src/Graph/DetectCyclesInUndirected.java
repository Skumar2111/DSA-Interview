package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DetectCyclesInUndirected {

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(2,1);
        graph.addEdge(0,3);
        graph.addEdge(3,4);

        boolean result = isCyclic(graph);

        System.out.println(result);

    }

    private static boolean isCyclic(Graph graph) {

        int V = graph.vertex;

        Boolean[] visited = new Boolean[V];

        for(int i = 0 ; i < V ; i++)
        {
            visited[i] = false;
        }

        for(int u = 0 ; u < V ; u++)
        {
            if(!visited[u])
            {
                if(cyclicUtil(u, visited , -1,graph))
                {
                    return true;
                }
            }
        }
        return false;
}

    private static boolean cyclicUtil(int u, Boolean[] visited, int parent,Graph graph) {

        visited[u] = true;

        Iterator<Integer> v = graph.adj.get(u).iterator();

        while(v.hasNext())
        {
            int i = v.next();
            if(!visited[i])
            {
                if(cyclicUtil(i,visited,u,graph))
                {
                    return true;
                }
            }

            else if (i != parent)
                return true;
        }

        return false;





    }

    static class Graph
{
    int vertex;

    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertex) {
        this.vertex = vertex;

        adj = new ArrayList<>(vertex);

        for (int i = 0; i < vertex; i++) {
            adj.add(new ArrayList<>());
        }
    }

        void addEdge(int u , int v)
        {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

    }
}
