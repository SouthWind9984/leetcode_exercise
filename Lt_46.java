package leetcode_exercise;

import java.util.ArrayList;
import java.util.List;

public class Lt_46 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] nums = {1,2,3};
		System.out.println(permute(nums));
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<Integer> integers = new ArrayList<Integer>();
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			integers.add(nums[i]);
			
			int size = resList.size();
			for (int j = 0; j < nums.length; j++) {
				integers = new ArrayList<Integer>(resList.get(size));
			}
		}
		
		
		
		return resList;

    }

}
