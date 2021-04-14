package leetcode_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lt_46 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] nums = {1,2,3};
		System.out.println(permute(nums));
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		int len = nums.length;
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			List<Integer> list = new ArrayList<>(nums[i]);
			int tmp = 0;
			for (int j = i+1; tmp < nums.length ; j++) {
				if(j<len){
					list.add(nums[j]);
					tmp++;
				}
				else
					j=0;
			}
			resList.add(list);
		}
		return resList;
    }
	class Solution {
		public List<List<Integer>> permute(int[] nums) {
			List<List<Integer>> res = new ArrayList<List<Integer>>();

			List<Integer> output = new ArrayList<Integer>();
			for (int num : nums) {
				output.add(num);
			}

			int n = nums.length;
			backtrack(n, output, res, 0);
			return res;
		}

		public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
			// 所有数都填完了
			if (first == n) {
				res.add(new ArrayList<Integer>(output));
			}
			for (int i = first; i < n; i++) {
				// 动态维护数组
				Collections.swap(output, first, i);
				// 继续递归填下一个数
				backtrack(n, output, res, first + 1);
				// 撤销操作
				Collections.swap(output, first, i);
			}
		}
	}

}
