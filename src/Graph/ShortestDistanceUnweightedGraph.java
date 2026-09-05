
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


/**
 * Shortest distance in an un weighted graph
 */

public class ShortestDistanceUnweightedGraph
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int vertices = 5;

        for(int i = 0 ; i < vertices ; i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        /**
         * Adding edges to graph
         */

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        


        /** Find shortest distance for each node from source */

        int source = 0;
        findShortestDistance(adj,source);

    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    public static int[] findShortestDistance(ArrayList<ArrayList<Integer>> adj , int source)
    {
        int[] distance = new int[adj.size()];
        boolean[] visited = new boolean[adj.size()];

       Arrays.fill(distance, Integer.MAX_VALUE);
       Arrays.fill(visited,false);

       // setting 0 th element

       distance[0] = 0;

       LinkedList<Integer> queue = new LinkedList<Integer>();

       visited[source] = true;

       queue.add(source);

       while(!queue.isEmpty())
       {
        int u = queue.pop();

        for(int v : adj.get(u))
        {
            if(visited[v] == false)
            {
                distance[v] = distance[u] + 1;
                visited[v] = true;
                queue.push(v);
            }
        }
       }

       return distance;
    }



}