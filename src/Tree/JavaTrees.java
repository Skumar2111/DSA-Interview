package Tree;

public class JavaTrees {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new TreeNode(10);
        binaryTree.root.left = new TreeNode(20);
        binaryTree.root.right = new TreeNode(30);
        binaryTree.root.left.left = new TreeNode(40);
        binaryTree.root.left.right = new TreeNode(50);

        System.out.println("Printing post Order traversal");
        System.out.println(" - - - - - - - - - - - - - - - \n");
        binaryTree.printPostOrder(binaryTree.root);

        System.out.println("\n");

        System.out.println(" ---------------------------------- ");

        System.out.println("Printing pre Order traversal");
        System.out.println(" - - - - - - - - - - - - - - - \n");
        binaryTree.printPreOrder(binaryTree.root);


        System.out.println("Printing In Order =============== \n");
        binaryTree.printInOrder(binaryTree.root);



    }

}

class TreeNode
{
    int data;
    TreeNode left,right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree
{
    TreeNode root;
    BinaryTree()
    {
        root = null;
    }

    void printPostOrder(TreeNode treeNode)
    {
        if(treeNode == null)
        {
            return;
        }
        printPostOrder(treeNode.left);

        printPostOrder(treeNode.right);

        System.out.printf(treeNode.data + " -> ");
    }



    void printPreOrder(TreeNode treeNode)
    {
        if(treeNode == null)
        {
            return;
        }

        System.out.printf(+treeNode.data + " -> ");

        printPreOrder(treeNode.left);

        printPreOrder(treeNode.right);


    }


    void printInOrder(TreeNode treeNode)
    {
        if(treeNode == null)
        {
            return;
        }

        printInOrder(treeNode.left);

        System.out.print(treeNode.data +" -> ");

        printInOrder(treeNode.right);
    }


}
