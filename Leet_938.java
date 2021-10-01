package LeetCode_ADailyTopic;

import LeetCode_ADailyTopic.Lt_173.TreeNode;

import java.util.Stack;

public class Leet_938 {

    public static void main(String[] args) {

    }

    private boolean flag = false;
    private int res = 0;
    private int low = 0;
    private int high = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        int res = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                //得到根节点值，进行相应的操作
                if (root.val >= low && root.val <= high) {
                    res += root.val;
                }
                root = root.right;
            }
        }
        return res;
    }

    public void DFS(TreeNode root) {
        if (root == null) return;
        DFS(root.left);
        if (root.val == low)
            this.flag = true;
        if (this.flag)
            this.res += root.val;
        if (root.val == high) {
            this.flag = false;
            return;
        }
        DFS(root.right);
    }

    public void Iteration(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                //得到根节点值，进行相应的操作
                System.out.println(root.val);
                root = root.right;
            }
        }
    }


}
