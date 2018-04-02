package symmetric_tree;

public class Solution {

    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(2);
        TreeNode tree3 = new TreeNode(2);
        TreeNode tree4 = new TreeNode(3);
        TreeNode tree5 = new TreeNode(4);
        TreeNode tree6 = new TreeNode(4);
        TreeNode tree7 = new TreeNode(3);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;
        tree3.left = tree6;
        tree3.right = tree7;

        System.out.println(isSymmetric(tree1));

        TreeNode m1 = new TreeNode(1);
        TreeNode m2 = new TreeNode(2);
        TreeNode m3 = new TreeNode(2);
        TreeNode m4 = new TreeNode(3);
        TreeNode m5 = new TreeNode(3);
        m1.left = m2;
        m1.right = m3;
        m2.right = m4;
        m3.right = m5;

        System.out.println(isSymmetric(m1));

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n1.left = n2;

        System.out.println(isSymmetric(n1));
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
//        if (root.right == null && root.left == null) {
//            return true;
//        }
//        if (root.left == null || root.right == null) {
//            return false;
//        }
//        if (root.left.val != root.right.val) {
//            return false;
//        }
        return isLevelSymmetric(root.left, root.right);
    }

    public static boolean isLevelSymmetric(TreeNode one, TreeNode two) {
        if (one == null && two == null) {
            return true;
        }
        if (one == null || two == null) {
            return false;
        }
        if (one.val != two.val) {
            return false;
        }
//        if (one.left == null && two.right != null) {
//            return false;
//        }
//        if (one.right == null && two.left != null) {
//            return false;
//        }
        return isLevelSymmetric(one.left, two.right) && isLevelSymmetric(one.right, two.left);
    }
}
