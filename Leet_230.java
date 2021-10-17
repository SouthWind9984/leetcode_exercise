package LeetCode_ADailyTopic;


import java.util.List;
import java.util.Stack;

import static LeetCode_ADailyTopic.Lt_04_02.TreeNode;

public class Leet_230 {
    public static void main(String[] args) {

    }

    private List<Integer> resList;

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }

}
