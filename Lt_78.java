package leetcode_exercise;

import java.util.ArrayList;
import java.util.List;

public class Lt_78 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {1,2,3};
		subsets(nums);
	}
	public static List<List<Integer>> subsets(int[] nums) {
		
		List<Integer> list1 =  new ArrayList<Integer>();
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		resList.add(list1);
		for(int i = 0 ; i< nums.length;i++) {
			int len = resList.size();
			for (int j = 0; j < len; j++) {
				list1=new ArrayList<Integer>(resList.get(j));
				list1.add(nums[i]);
				resList.add(list1);
			}
			System.out.println(resList);
		}
		return resList;
    }

}
