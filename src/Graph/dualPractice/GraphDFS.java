package Graph.dualPractice;

import java.util.ArrayList;
import java.util.List;

public class GraphDFS {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        int vertices = 5;

        boolean[] visited = new boolean[vertices];


        for(int i = 0 ; i < vertices ; i++)
        {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,0,1);
        addEdge(adjList,0,2);
        addEdge(adjList,1,2);
        addEdge(adjList,2,3);
        addEdge(adjList,3,4);

        List<Integer> result = new ArrayList<>();

        dfsRec(adjList,0,visited, result);

        System.out.println(result);

    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] visited, List<Integer> result) {

        visited[source] = true;
        result.add(source);

        for(int data : adjList.get(source))
        {
            if(!visited[data])
            {
                dfsRec(adjList,data,visited,result);
            }
        }

    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }
}
