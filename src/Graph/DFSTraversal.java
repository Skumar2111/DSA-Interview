
import java.util.ArrayList;

public class DFSTraversal
{
    public static void main(String args[])
    {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int vertices = 5;

        for(int i = 0 ; i < vertices ; i++)
        {
            adj.add(new ArrayList<Integer>());
        }


        addEdges(adj,1,2);
        addEdges(adj,2,3);


        /** Add recusion code */
        dfs(adj);
    }

    public static void addEdges(ArrayList<ArrayList<Integer>> adj,int u , int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()];

        ArrayList<Integer> result = new ArrayList<>();
        dfsRec(adj, visited , 0 , result);

        return result;
    }

    public static void defRec(ArrayList<ArrayList<Integer>> adj , boolean[] visited , int s , ArrayList<Integer> res)
    {
        visited[s] = true;

        res.add(s);

        for(int i : adj.get(s))
        {
            if(!visited[i])
            {
                dfsRec(adj,visited,i,res);
            }
        }
     }

}