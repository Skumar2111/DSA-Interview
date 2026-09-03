public class BFSTraversal
{

public static void main(String args[])
{

ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
int vertices = 5;

for(int i = 0 ; i < vertices ; i++)
{
  adjList.add(new ArrayList<Integer>());
}



addEdge(adjList,1,2);
addEdge(adjList,1,3);
addEdge(adjList,2,3);
addEdge(adjList,2,4);


BFSTraversal(adjList,vertices);

}


public static void BFSTraversal(ArrayList<ArrayList<Integer>> adjList , int V)
{

boolean[] visited = new boolean[V+1];

for(int i = 1 ; i <= V ; i++)
{

visited[i] = false;

}

int source = 0 ;


 LinkedList<Integer> queue = new LinkedList<Integer>();


visited[source] = true;

queue.add(source);

while(queue.size() != 0)
{

source = queue.poll();

System.out.println("source");

for(int i = 0 ; i < adjList.get(source).size() ; i++)
{

int newNode = adjList.get(source).get(i);

if(visited[newNode] ==false)
{

visited[newNode] = true;

queue.add(newNode);

}


}
}
}

public static void addEdge(ArrayList<ArrayList<Integer>> adjList , int u , int v)
{

adjList.get(u).add(v);
adjList.get(v).add(u);

}
}

