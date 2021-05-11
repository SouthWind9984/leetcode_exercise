package leetcode_exercise;

import leetcode_exercise.Lt_173.TreeNode;

import java.util.ArrayList;

public class Leet_872 {
    public static void main(String[] args) {

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        DFS(root1, list1);
        DFS(root2, list2);
        return list1.equals(list2);
    }

    public void DFS(TreeNode root, ArrayList list) {
        if (root == null)
            return;
        DFS(root.left, list);
        if (root.right == null && root.left == null) {
            list.add(root.val);
        }
        DFS(root.right, list);
    }

}
