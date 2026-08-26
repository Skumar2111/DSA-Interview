package Leetcodes.Tree;

public class BalancedTree {

    public static void main(String[] args) {

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
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return height(root) != -1;
        }

        private int height(TreeNode root)
        {
            if(root == null)
            {
                return 0;
            }

            int lHeight = height(root.left);

            if(lHeight == -1)
            {
                return -1;
            }

            int rHeight = height(root.right);

            if(rHeight == -1)
            {
                return -1;
            }

            if (Math.abs(lHeight - rHeight) > 1) {
                return -1;
            }

            return 1 + Math.max(lHeight , rHeight);
        }
    }
}
