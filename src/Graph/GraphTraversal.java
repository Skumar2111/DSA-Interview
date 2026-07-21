package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

import static Graph.GraphWork.addEdge;

public class GraphTraversal {

    public static void main(String[] args) {

        int vertex = 6;

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0 ; i < vertex; i++)
        {
            adjList.add(new ArrayList<>());
        }


        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 2, 5);
        addEdge(adjList, 3, 5);
        addEdge(adjList, 4, 5);
        addEdge(adjList, 4, 6);
        addEdge(adjList, 5, 6);


        BFS(adjList,vertex);

    }

    private static void BFS(ArrayList<ArrayList<Integer>> adjList, int vertex) {

        boolean visited[] = new boolean[vertex];

        for (int i = 0; i < vertex; i++) {
            visited[i] = false;
        }

        LinkedList<Integer> queue = new LinkedList<>();

        int source = 1;
        visited[source] = true;
        queue.add(source);

        while (queue.size() != 0)
        {
            source = queue.poll();
            System.out.print(source +" ");
        }

        for(int i = 0 ; i < adjList.get(source).size(); i++)
        {
            int newNode = adjList.get(source).get(i);

            if(visited[newNode] == false)
            {
                visited[newNode] = true;

                queue.add(newNode);
            }
        }
    }

}
