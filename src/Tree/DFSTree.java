package Tree;

public class DFSTree {

    Node node;

    public static void main(String[] args) {
        LevelOrder lo = new LevelOrder();
        lo.node = new Node(10);
        lo.node.left = new Node(20);
        lo.node.right = new Node(30);
        lo.node.left.left = new Node(40);
        lo.node.left.right = new Node(50);

        dfs(lo.node);
    }

    private static void dfs(Node node) {

        if(node == null)
        {
            return;
        }

        dfs(node.left);

        System.out.println(node.data);

        dfs(node.right);
    }

}


