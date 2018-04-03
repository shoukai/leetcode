package maximum_depth_of_binary_tree;

public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(9);
        TreeNode a3 = new TreeNode(20);
        TreeNode a4 = new TreeNode(15);
        TreeNode a5 = new TreeNode(7);

        a1.left = a2;
        a1.right = a3;
        a3.left = a4;
        a3.right = a5;

        System.out.println(maxDepth(a1));
    }

    static int maxDepth(TreeNode root) {
        if (root != null) {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return l >= r ? l + 1 : r + 1;
        } else {
            return 0;
        }
    }

}
