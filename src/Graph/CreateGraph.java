
import java.util.*;

public class CreateGraph
{

public static void main(String args[])
{
int vertex = 5;
ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(5);
      



for(int i = 0 ; i < vertex ; i++)
{
   graph.add(new ArrayList<Integer>());
}

addEdge(graph,0,1);
addEdge(graph,0,2);
addEdge(graph,1,2);
addEdge(graph,1,3);


        for (ArrayList<Integer> gr: graph) {
            System.out.println(graph);
        }



}



public static void addEdge(ArrayList<ArrayList<Integer>> adjList , int u , int v)
{

adjList.get(u).add(v);
adjList.get(v).add(u);


}
}