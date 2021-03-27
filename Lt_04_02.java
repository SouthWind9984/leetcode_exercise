package leetcode_exercise;

import java.util.Arrays;

public class Lt_04_02 {

	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {-10,-3,0,5,9};
		TreeNode newnode = sortedArrayToBST(nums);
//		System.out.println(newnode.val);
		
	}
	public static class TreeNode {
		int val;
		 TreeNode left;
		 TreeNode right;
		TreeNode(int x) { val = x; }
		
	}
	public static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length==0) return null;
        int len = nums.length;
        System.out.println(nums[len/2]);
        TreeNode newNode = new TreeNode(nums[len/2]);
        newNode.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, len/2));
        newNode.right= sortedArrayToBST(Arrays.copyOfRange(nums, len/2+1, len));
        return newNode;
    }
	

}
