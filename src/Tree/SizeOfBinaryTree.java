package Tree;

public class SizeOfBinaryTree {

    SizeNode root;

    public static void main(String[] args) {

        SizeOfBinaryTree sizeOfBinaryTree = new SizeOfBinaryTree();

        sizeOfBinaryTree.root = new SizeNode(10);
        sizeOfBinaryTree.root.left = new SizeNode(20);
        sizeOfBinaryTree.root.right = new SizeNode(03);
        sizeOfBinaryTree.root.left.left = new SizeNode(30);


        System.out.println(findSize(sizeOfBinaryTree.root));


    }

    private static int findSize(SizeNode root) {

        if(root == null)
        {
            return 0;
        }

        return 1 + findSize(root.left) + findSize(root.right);
    }

}


class SizeNode
{
    int data;
    SizeNode left,right;

    public SizeNode(int data) {
        this.data = data;
        left = right = null;
    }
}