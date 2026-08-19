package Leetcodes.Tree;

/*LeetCode 104*/
public class HeightOfBST {

    BSTNode root;

    public static void main(String[] args) {
        HeightOfBST heightOfBST = new HeightOfBST();
        heightOfBST.root = new BSTNode(1);
        heightOfBST.root.left = new BSTNode(2);
        heightOfBST.root.right = new BSTNode(3);
        heightOfBST.root.left.left = new BSTNode(4);

        System.out.println(maxDept(heightOfBST.root));


    }

   static int maxDept(BSTNode node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            int lDepth = maxDept(node.left);
            int rDepth = maxDept(node.right);

            if(lDepth > rDepth)
            {
                return (lDepth+1);
            }
            else
            {
                return (rDepth+1);
            }
        }

    }


}


class BSTNode
{
    int data;
    BSTNode left , right;

    BSTNode(int data)
    {
        this.data = data;
        left=right = null;
    }
}


