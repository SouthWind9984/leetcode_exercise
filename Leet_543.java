package leetcode_exercise;

import leetcode_exercise.Lt_173.TreeNode;

public class Leet_543 {
    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree(TreeNode root) {

        return 0;
    }

    public void DFS(TreeNode root, int n) {
        if (root == null)
            return;
        DFS(root.left, n + 1);

        DFS(root.right, n + 1);
    }
}

