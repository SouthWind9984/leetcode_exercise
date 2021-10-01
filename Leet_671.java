package LeetCode_ADailyTopic;

import LeetCode_ADailyTopic.Lt_104.TreeNode;

public class Leet_671 {

    public static void main(String[] args) {

    }

    public int findSecondMinimumValue(TreeNode root) {
        int res = 0;
        if (root.left == null) return -1;
        int left = root.left.val;
        int right = root.right.val;
        if (left == right) return -1;
        return Math.max(root.left.val, root.right.val);
    }
}
