package Graph;

import java.util.ArrayList;

public class GraphDFS {

    public static void main(String[] args) {

        int vertex = 5;
        int source = 0;

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0 ; i < vertex; i++)
        {
            adjList.add(new ArrayList<>());
        }

        DFS(adjList,vertex,source);

    }

    private static void DFS(ArrayList<ArrayList<Integer>> adjList, int vertex, int source) {

        boolean Visited[] = new boolean[vertex];

        DFSRec(adjList,source,Visited);
    }

    private static void DFSRec(ArrayList<ArrayList<Integer>> adjList, int source, boolean[] visited) {

        visited[source] = true;

        System.out.println(source);

        for(int u : adjList.get(source))
        {
            if(visited[u] == false)
            {
                DFSRec(adjList,u,visited);
            }
        }
    }
}
