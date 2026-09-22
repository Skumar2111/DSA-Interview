package Graph.dualPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int vertices = 5;

        for(int i = 0 ; i < vertices ; i++)
        {
            adjList.add(new ArrayList<>());
        }

        int[] indegree = new int[vertices];

        addEdge(adjList,0,1,indegree);
        addEdge(adjList,0,2,indegree);
        addEdge(adjList,1,2,indegree);
        addEdge(adjList,2,3,indegree);
        addEdge(adjList,3,4,indegree);


        topological(adjList,indegree,0);

    }

    private static void topological(ArrayList<ArrayList<Integer>> adjList, int[] indegree, int source) {

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < indegree.length ; i++)
        {
            if(indegree[i] == 0)
            {
                queue.add(i);
            }
        }

        while(!queue.isEmpty())
        {
            int u = queue.poll();
            System.out.println(u);

            for(int v : adjList.get(u))
            {
                indegree[v] --;
                if(indegree[v] == 0)
                {

                    queue.add(v);
                }
            }

        }


    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v, int[] indegree) {

        adjList.get(u).add(v);
        indegree[v]++;

    }
}
