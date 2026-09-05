
import java.util.ArrayList;
import java.util.Arrays;



/**
 * Shortest distance in an un weighted graph
 */

public class DetectCycleInGraph
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
        


        /** Find cycle in Graph */

        DFS(adj,vertices);




    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
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




}