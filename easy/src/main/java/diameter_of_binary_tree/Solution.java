package diameter_of_binary_tree;

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
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;

        System.out.println(diameterOfBinaryTree(a1));
        System.out.println(diameterOfBinaryTree(a5));
    }

    static int diameterOfBinaryTree(TreeNode root) {
        return 0;
    }

}
