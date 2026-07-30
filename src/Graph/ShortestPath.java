package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

    public static void main(String[] args) {

        int vertex = 5;
        int source = 0;

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0 ; i < vertex; i++)
        {
            adjList.add(new ArrayList<>());
        }


        shortestPath(adjList,source,vertex);



    }

    private static void shortestPath(ArrayList<ArrayList<Integer>> adjList, int source, int vertex) {

        int[] distance = new int[vertex];
        boolean[] visited = new boolean[vertex];

        for(int i = 0 ; i < distance.length; i++)
        {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        distance[source] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[0]  = true;

        while(!queue.isEmpty())
        {
            int u = queue.poll();

            for(int v : adjList.get(u))
            {
                if(visited[v] == false)
                {
                    distance[v] = distance[u] + 1;
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }




    }


}
