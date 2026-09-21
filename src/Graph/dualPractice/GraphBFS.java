package Graph.dualPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class GraphBFS {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        int vertices = 5;

        for(int i = 0 ; i < vertices ; i++)
        {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,0,1);
        addEdge(adjList,0,2);
        addEdge(adjList,1,2);
        addEdge(adjList,2,3);
        addEdge(adjList,3,4);

        BFS(adjList,0, vertices);
    }


    private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }



    private static void BFS(ArrayList<ArrayList<Integer>> adjList, int source , int vertices) {

        boolean[]  visited = new boolean[vertices];
        int[] distance = new int[vertices];

        for(int i = 0 ; i < vertices ; i++)
        {
            distance[i] = Integer.MIN_VALUE;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        distance[source] = 1;
        while(!queue.isEmpty())
        {
           int current = queue.poll();
            System.out.println(current);
           for(int node : adjList.get(current))
           {
               if(!visited[node])
               {
                   distance[node] = distance[current] + 1;
                   queue.add(node);
                   visited[node] = true;
               }

           }


        }


        for(int i = 0 ; i < distance.length ; i++)
        {
            System.out.println(distance[i]);
        }



    }
}


