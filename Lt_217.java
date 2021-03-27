package leetcode_exercise;

import java.util.HashMap;

public class Lt_217 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	
	public static boolean containsDuplicate(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max =0;
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
			max = Math.max(max, map.get(nums[i]));
		}
		return max<2;

    }

}
