package leetcode_exercise;

import leetcode_exercise.Lt_173.TreeNode;

public class Leet_897 {
    public static void main(String[] args) {

    }


    private TreeNode orderTreeNode = null;
    private TreeNode next = null;

    public TreeNode increasingBST(TreeNode root) {
        DFS(root);
        return orderTreeNode;
    }

    public void DFS(TreeNode root) {
        if (root == null) return;
        DFS(root.left);
        if (orderTreeNode == null) {
            orderTreeNode = root;
            next = orderTreeNode;
        } else {
            next.right = new TreeNode(root.val);
            next = next.right;
        }
        DFS(root.right);
    }
}
