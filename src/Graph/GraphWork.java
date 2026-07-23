package Graph;

import java.util.ArrayList;

public class GraphWork {


    static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    static void printGraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i = 1; i < adj.size(); i++)
        {
            System.out.println("Adjacency list of vertex : "+i);

                for(int j = 1 ; j <= adj.get(i).size(); j++)
                {
                    System.out.println("-> "+adj.get(i).get(j));
                }

            }
    }


    public static void main(String[] args) {

        int vertex = 6;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 1 ; i <= vertex ; i++)
        {
            adjList.add(new ArrayList<>());
        }


        addEdge(adjList,0,1);
        addEdge(adjList,0,4);
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,3);
        addEdge(adjList,3,4);

        printGraph(adjList);

    }


}



