package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class DetectCycleInDirectedGraph
{

    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int vertices = 5;

        for(int i = 0 ; i < vertices ; i++)
        {
            adj.add(new ArrayList<Integer>());
        }


        int[] inDegree = new int[vertices];

        addEdge(adj,0,1,inDegree);
        addEdge(adj,0,2,inDegree);
        addEdge(adj,1,2,inDegree);
        addEdge(adj,2,3,inDegree);
        addEdge(adj,3,4,inDegree);


        boolean isCyclic = topologicalSort(adj,0,inDegree,vertices);

        System.out.println(isCyclic);
    }



    public static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v , int[] inDegree)
    {
        adj.get(u).add(v);
        inDegree[v]++;
    }


    public static boolean topologicalSort(ArrayList<ArrayList<Integer>> adj , int source , int[] inDegree, int vertices)
    {

        LinkedList<Integer> queue = new LinkedList<Integer>();

        for(int i = 0 ; i < adj.size() ; i++)
        {
            if(inDegree[i] == 0)
            {
                queue.add(i);
            }
        }

        int count = 0;
        while(!queue.isEmpty())
        {
            int u =  queue.pop();

            for(int v : adj.get(u))
            {
                inDegree[v]--;
                if(inDegree[v] == 0)
                {
                    queue.add(v);

                }
            }

            count++;

        }


        return count!= vertices;

    }
}