package invert_binary_tree;

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
        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(7);
        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(3);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(9);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        preOrder(a1);
        System.out.println("--");

        TreeNode rs = invertTree(a1);
        preOrder(rs);
    }

    static TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    static void invert(TreeNode point) {
        if (point == null) {
            return;
        }
        TreeNode tmp = point.left;
        point.left = point.right;
        point.right = tmp;
        invert(point.left);
        invert(point.right);
    }

    static void preOrder(TreeNode point) {
        if (point != null) {
            System.out.println(point.val);
            preOrder(point.left);
            preOrder(point.right);
        }
    }

}
