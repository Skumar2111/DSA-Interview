package Graph.dualPractice;

import java.util.ArrayList;
import java.util.List;

public class CycleExist {

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


        for(int i = 0 ; i < vertices ; i++) {
            if(visited[i] == false)
            {
                if(dfsRec(adjList, 0, visited, -1))
                {
                    System.out.println(true);
                    return;
                }
            }

        }
        System.out.println(false);

    }

    private static boolean dfsRec(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] visited, int parent) {

        visited[source] = true;


        for(int data : adjList.get(source))
        {
            if(!visited[data])
            {
               if(dfsRec(adjList,data,visited,source)) return true;
            }
            else if ( data != parent)
            {
                return true;
            }
        }

        return false;

    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }
}
