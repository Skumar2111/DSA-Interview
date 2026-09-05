
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;



/**
 * Shortest distance in an un weighted graph
 */

public class TopologicalSort
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

        int[] indegree = new int[vertices];
        addEdge(adj,0,1,indegree);
        addEdge(adj,0,2,indegree);
        addEdge(adj,1,2,indegree);
        addEdge(adj,2,3,indegree);
        addEdge(adj,3,4,indegree);
        


        /** Find cycle in Graph */

        topologicalSort(adj,0,indegree);   




    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v, int[] indegree)
    {
        adj.get(u).add(v);
        
    }

    public static boolean DFS(ArrayList<ArrayList<Integer>> adj , int vertices)
    {
        boolean[] visited = new boolean[vertices];

        Arrays.fill(visited,false);

        for(int i = 0 ; i < vertices ; i++)
        {
            if(visited[i] == false)
            {
                if(DFSRec(adj,i,visited,-1))
                {
                    return true;
                }
            }

        }
        return false;
    }


    public static boolean DFSRec(ArrayList<ArrayList<Integer>> adj , int source , boolean[] visited , int parent)
    {

        visited[source] = true;

        for(int u : adj.get(source))
        {
            if(visited[u] == false)
            {
                if(DFSRec(adj,u,visited,source))
                {
                    return true;
                }
            }
            else if ( u != parent)
            {
                return true;
            }
        
        }

        return false;

    }


public static void topologicalSort(ArrayList<ArrayList<Integer>> adj , int source , int[] indegree)

{
    LinkedList<Integer> queue = new LinkedList<>();

    for(int i = 0 ; i < indegree.length ; i++ )
    {
        if(indegree[i] == 0)
        {
            queue.add(i);
        }
    }

    while(!queue.isEmpty())
    {
        int u = queue.pop();
        System.out.println(u);

        for(int v : adj.get(u))
        {
            indegree[v] --;
            if(indegree[v] == 0)
            {
                queue.add(v);
            }
        }
    }



}


}