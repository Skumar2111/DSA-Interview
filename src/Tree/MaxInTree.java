package Tree;

public class MaxInTree {

    Node root;

    public static void main(String[] args) {

        MaxInTree maxInTree = new MaxInTree();
        maxInTree.root = new Node(10);
        maxInTree.root.left = new Node(20);
        maxInTree.root.right = new Node(30);
        int initial = -1;
        System.out.println(findMax(maxInTree.root));

    }

    private static int findMax(Node root) {

        if(root == null)
        {
            return Integer.MIN_VALUE;
        }

        int result = root.data;

        int l_result = findMax(root.left);
        int r_result = findMax(root.right);

        if(l_result > result)
        {
            result = l_result;
        }
        if(r_result > result)
        {
            result = r_result;
        }

        return result;


    }


}
