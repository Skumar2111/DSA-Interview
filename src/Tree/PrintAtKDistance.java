package Tree;

public class PrintAtKDistance {

    Node root;

    public static void main(String[] args) {

        PrintAtKDistance printAtKDistance = new PrintAtKDistance();

        printAtKDistance.root = new Node(10);
        printAtKDistance.root.left = new Node(20);
        printAtKDistance.root.right = new Node(30);
        printAtKDistance.root.left.left = new Node(40);

        int k = 1;
        printKDistant(printAtKDistance.root, k);

    }

    private static void printKDistant(Node root, int k) {

        if(root == null || k < 0)
        {
            return;
        }
        if(k == 0)
        {
            System.out.print(root.data +"  ");
            return;
        }

        printKDistant(root.left, k-1);
        printKDistant(root.right,k-1);


    }


}

class Node
{

    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
        left=right=null;
    }
}
