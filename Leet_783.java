package leetcode_exercise;

import leetcode_exercise.Lt_104.TreeNode;

import java.util.ArrayList;

public class Leet_783 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        //中序，左--根--右
        private int min = 100001;
        private ArrayList<Integer> list = new ArrayList<>();
        public int minDiffInBST(TreeNode root) {
            dfs(root);
            return min;
        }
        public void dfs(TreeNode root){
            if(root==null) return;
            dfs(root.left);
            list.add(root.val);
            dfs(root.right);
        }
    }
}
