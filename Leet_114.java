package leetcode_exercise;

import leetcode_exercise.Lt_173.TreeNode;

public class Leet_114 {
    public static void main(String[] args) {

    }
    TreeNode resNode ;
    TreeNode nextNode  = resNode.right;
    public void flatten(TreeNode root) {
        /*
       先序遍历
        操作后左然后右边节点
         */
        nextNode = root;
        flatten(nextNode.left);
        flatten(nextNode.right);
    }

}

