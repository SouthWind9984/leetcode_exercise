package LeetCode_ADailyTopic;

public class Lt_104 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

    }

    public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }

    }

    public static int maxDepth(TreeNode root) {
		int left = maxDepth(root.left)+1;
		int right = maxDepth(root.right)+1;
		return Math.max(left, right);
	}
}

