package LeetCode_ADailyTopic;

import java.util.ArrayList;

public class Lt_1389 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr1 = {0,1,2,3,4};
		int [] arr2	= {0,1,2,2,1};
		int [] arr3 = createTargetArray(arr1, arr2);
		for (int i : arr3) {
			System.out.println(i);
		}
	}
	public static int[] createTargetArray(int[] nums, int[] index) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int target [] =new int [nums.length];
		for (int i = 0; i < target.length; i++) {
			list.add(index[i],nums[i]);
		}

        for(int i=0;i<list.size();i++)
		{
			target[i]=list.get(i);
		}
		return target;
	}

}
