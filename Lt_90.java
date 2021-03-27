package leetcode_exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lt_90 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {1,2,2};
		subsetsWithDup(nums);
	}
	 public static List<List<Integer>> subsetsWithDup(int[] nums) {
	        List<Integer> list1 =  new ArrayList<Integer>();
			List<List<Integer>> resList = new ArrayList<List<Integer>>();
			HashMap<List<Integer>,Integer> map = new HashMap<List<Integer>, Integer>();
			resList.add(list1);
			for(int i = 0 ; i< nums.length;i++) {
				int len = resList.size();
				for (int j = 0; j < len; j++) {
					list1=new ArrayList<Integer>(resList.get(j));
					list1.add(nums[i]);
					if(map.get(list1)==null) {
						resList.add(list1);
						map.put(list1, 1);
					}
						
				}
			}
			return resList;
	    }

}
