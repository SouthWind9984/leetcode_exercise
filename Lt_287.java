package leetcode_exercise;

import java.util.Arrays;

public class Lt_287 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums  = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	
	public static int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		int res = 0;
		for (int i = 0; i < nums.length-1; i++) {
			
			if((nums[i]^nums[i+1])==0)
				return nums[i];
		}
		return 0;
    }

}
