package Leetcodes.Tree;

/*543. Diameter of Binary Tree*/
public class DiameterOfBT {

    public static void main(String[] args) {
       // diameterOfBinaryTree();
    }
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

        int maxDiameter = 0;
        public int diameterOfBinaryTree(TreeNode root) {

            maxDiameter = 0;

            diameterRec(root);

            return maxDiameter;

        }

        int diameterRec(TreeNode root)
        {
            if(root == null)
            {
                return 0;
            }

            int lHeight = diameterRec(root.left);
            int rHeight = diameterRec(root.right);

            if(lHeight + rHeight > maxDiameter)
            {
                maxDiameter = lHeight + rHeight;
            }

            return 1 + Math.max(lHeight, rHeight);
        }
    }

