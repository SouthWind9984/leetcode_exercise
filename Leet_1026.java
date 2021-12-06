package LeetCode_ADailyTopic;


public class Leet_1026 {
    public static void main(String[] args) {

    }

    /*
    进入下一个节点，传入之前的最大值和最小值
    维护最大值和最小值
     */
    public int maxAncestorDiff(TreeNode root) {
        int left = diffMaxMin(root.left, root.val, root.val);
        int right = diffMaxMin(root.right, root.val, root.val);
        return Math.max(left, right);
    }

    public int diffMaxMin(TreeNode root, int max, int min) {
        if (root != null) {
            max = Math.max(max, root.val);
            min = Math.min(min, root.val);
            /*
            进入下一个节点，传入父节点的最大值和最小值
             */
            int left = diffMaxMin(root.left, max, min);
            int right = diffMaxMin(root.right, max, min);
            return Math.max(left, right);
        } else {
            /*
            到最后一个叶子节点，返回差值
             */
            return max - min;
        }
    }
}
