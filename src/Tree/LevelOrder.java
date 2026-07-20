package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    Node node;

    public static void main(String[] args) {
        LevelOrder lo = new LevelOrder();
        lo.node = new Node(10);
        lo.node.left = new Node(20);
        lo.node.right = new Node(30);
        lo.node.left.left = new Node(40);
        lo.node.left.right = new Node(50);

        levelOrder(lo.node);
    }

    private static void levelOrder(Node node) {

        Queue<Node> levelQueue = new LinkedList<Node>();

        levelQueue.add(node);

        while (!levelQueue.isEmpty())
        {
            Node tempNode = levelQueue.poll();
            System.out.print(tempNode.data +" ");

            if(tempNode.left != null)
            {
                levelQueue.add(tempNode.left);
            }
            if(tempNode.right != null)
            {
                levelQueue.add(tempNode.right);
            }
        }



    }

}


