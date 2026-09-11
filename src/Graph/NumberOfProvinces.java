package Graph;

import java.util.ArrayList;

class NumberOfProvinces {

    public static void main(String[] args) {
        int[][] mat = new int[2][2];

        findCircleNum(mat);
    }

    public static int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        int m = isConnected.length;
        int n = isConnected[0].length;

        for(int i = 0 ; i < m ; i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ;j++)
            {
                if(isConnected[i][j] == 1 && i != j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }


        int[] visited = new int[n];
        int count = 0;
        for(int i = 0 ; i < m ; i++)
        {
            if(visited[i] == 0)
            {
                count++;
                dfs(adj,i, visited);
            }
        }

        return count;
    }


    public static void dfs(ArrayList<ArrayList<Integer>> adj , int node , int[] visited)
    {
        visited[node] = 1;

        for(int value : adj.get(node))
        {
            if(visited[value] == 0)
            {
                dfs(adj, value , visited);
            }
        }
    }
}