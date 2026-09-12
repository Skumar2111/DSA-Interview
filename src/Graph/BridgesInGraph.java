package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BridgesInGraph {

    static int timer = 1;
    public static void main(String[] args) {
        int vertices = 5;
        List<List<Integer>> connections = new ArrayList<>();
        criticalConnections(vertices,connections);
    }


        public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

            ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
            for(int i = 0 ; i < n ; i++)
            {
                adjList.add(new ArrayList<>());
            }

            for(List<Integer> it : connections)
            {
                int u = it.get(0);
                int v = it.get(1);

                adjList.get(u).add(v);
                adjList.get(v).add(u);


            }

            int[] visited = new int[n];
            int[] tim = new int[n];
            int[] lower = new int[n];

            List<List<Integer>> bridges = new ArrayList<>();

            dfs(0,-1,visited,adjList,tim,lower,bridges);

            return bridges;


        }


        public static void dfs(int node , int parent, int[] visited, ArrayList<ArrayList<Integer>> adjList , int[] tim , int[] lower , List<List<Integer>> bridges)
        {


            visited[node] = 1;
            tim[node] = lower[node] = timer;

            timer++;
            for(Integer it : adjList.get(node))
            {
                if(it == parent) continue;

                if(visited[it] == 0)
                {
                    dfs(it,node,visited,adjList,tim,lower,bridges);
                    lower[node] = Math.min(lower[node],lower[it]);

                    if(lower[it] > tim[node])
                    {
                        bridges.add(Arrays.asList(it,node));
                    }
                }
                else
                {
                    lower[node] = Math.min(lower[node],tim[it]);
                }
            }
        }
    }

