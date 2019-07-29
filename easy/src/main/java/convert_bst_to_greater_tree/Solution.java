package convert_bst_to_greater_tree;


/**
 * @Author: Shoukai Huang
 * @Date: 2019/7/29 22:02
 */
public class Solution {

    static int sum = 0;

    public static TreeNode convertBST(TreeNode root) {
        index(root);
        return root;
    }

    private static void index(TreeNode node) {
        if (node == null) {
            return;
        }
        index(node.right);
        node.val = node.val + sum;
        sum = node.val;
        index(node.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        TreeNode greaterTree = convertBST(root);
        System.out.println(greaterTree.val);
        System.out.println(greaterTree.left.val);
        System.out.println(greaterTree.right.val);
    }
}
