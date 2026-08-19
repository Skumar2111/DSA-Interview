package Leetcodes.Tree;


public class IsSameTree {

    public static void main(String[] args) {
        TreeNode leftTreeNode = new TreeNode(10,null,null);
        TreeNode rightTreeNode = new TreeNode(10,null,null);
        isSameTree(leftTreeNode,rightTreeNode);
    }
        public static boolean isSameTree(TreeNode p, TreeNode q) {

            if(p == null && q == null)
            {
                return true;
            }

            if(p == null || q == null || p.val != q.val)
            {
                return false;
            }

            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

        }
    }

