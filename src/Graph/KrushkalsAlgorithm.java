package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KrushkalsAlgorithm {

    public static void main(String[] args) {
        int n = 4;
        List<Edge> edge = new ArrayList<>();
        edge.add(new Edge(0,1,1));
        edge.add(new Edge(1,2,2));
        edge.add(new Edge(0,2,3));
        edge.add(new Edge(1,3,4));
        edge.add(new Edge(2,3,5));

        kruskal(n,edge);

    }


    static class Edge {

        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }


    static class DSU
    {
        int[] parent;
        int[] rank;

        public DSU(int n) {
            parent = new int[n];
            rank = new int[n];

            for(int i = 0 ; i < n ; i++)
            {
                parent[i] = i;
            }
        }

        int find(int x)
        {
            if(parent[x] != x)
            {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int a , int b)
        {
            int rootA = find(a);
            int rootB = find(b);

            if(rootA == rootB)
            {
                return false;
            }

            if(rank[rootA] < rank[rootB])
            {
                parent[rootA] = parent[rootB];

            } else if (rank[rootA] > rank[rootB]) {

                parent[rootB] = rootA;

            }
            else
            {
                parent[rootB] = rootA;
                rank[rootA]++;
            }

            return true;
        }

    }


    static int kruskal(int n , List<Edge> edges)
    {
        edges.sort(Comparator.comparingInt((e) -> e.weight));

        DSU dsu = new DSU(n);

        int totalWeight = 0 ;
        int edgeUsed = 0;

        for(Edge edge : edges)
        {
            if(dsu.union(edge.source,edge.destination))
            {
                totalWeight += edge.weight;
                edgeUsed++;

                System.out.println(edge.source +"-"+ edge.destination +":" + edge.weight);

                if(edgeUsed == n-1)
                {
                    break;
                }




            }
        }
        if (edgeUsed != n - 1) {
            throw new IllegalArgumentException(
                    "Graph is disconnected; no spanning tree exists."
            );
        }
        return totalWeight;
    }
}


