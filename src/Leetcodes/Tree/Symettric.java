package Leetcodes.Tree;

public class Symettric {

    public static void main(String[] args) {
        BinaryTreeNode node = new BinaryTreeNode(01);
        System.out.println(isSymmetric(node));
    }
        public static boolean isSymmetric(BinaryTreeNode root) {

            if(root == null)
            {
                return true;
            }
            else
                return isMirror(root.left,root.right);

        }


        public static boolean isMirror(BinaryTreeNode left, BinaryTreeNode right)
        {
            if(left == null && right == null)
            {
                return true;
            }

            if(left == null || right == null || (left.val != right.val))
            {
                return false;
            }

            return isMirror(left.left,right.right) && isMirror(left.right,right.left);
        }
    }



 class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode() {}
    BinaryTreeNode(int val) { this.val = val; }
    BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
