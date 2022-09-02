package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/9/2
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_687 {

    public static void main(String[] args) {

    }

    class Solution {
        int res = 0;

        public int longestUnivaluePath(TreeNode root) {
            if (root == null)
                return 0;
            else
                return dfs(root);
        }

        public int dfs(TreeNode node) {
            if (node == null)
                return 0;
            int leftValue = dfs(node.left);
            int rightValue = dfs(node.right);
            leftValue = (node.left != null && node.val == node.left.val) ? ++leftValue : 0;
            rightValue = (node.right != null && node.val == node.right.val) ? ++rightValue : 0;
            res = Math.max(res, leftValue + rightValue);
            return Math.max(leftValue, rightValue);
        }
    }

}
