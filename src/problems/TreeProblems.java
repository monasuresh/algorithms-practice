package problems;

public class TreeProblems {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode subTree = null;
        while (root != null) {
            if (val == root.val) {
                return root;
            } else if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 0;
        } else if (root.left == null && root.right != null) {
            return 1;
        }  else if (root.right == null && root.left != null) {
            return 1;
        } else {
            return diameterOfBinaryTree(root.left) + diameterOfBinaryTree(root.right) + 1;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
