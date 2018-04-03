package merge_two_binary_trees;

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
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(2);
        TreeNode a4 = new TreeNode(5);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;

        TreeNode b1 = new TreeNode(2);
        TreeNode b2 = new TreeNode(1);
        TreeNode b3 = new TreeNode(3);
        TreeNode b4 = new TreeNode(4);
        TreeNode b5 = new TreeNode(7);

        b1.left = b2;
        b1.right = b3;
        b2.right = b4;
        b3.right = b5;

        TreeNode rs = mergeTrees(a1, b1);
        preOrder(rs);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == null ? t2 : t1;
        }
        TreeNode tmp = new TreeNode(t1.val + t2.val);
        tmp.left = mergeTrees(t1.left, t2.left);
        tmp.right = mergeTrees(t1.right, t2.right);
        return tmp;
    }

    static void preOrder(TreeNode point) {
        if (point != null) {
            System.out.println(point.val);
            preOrder(point.left);
            preOrder(point.right);
        }
    }

}
