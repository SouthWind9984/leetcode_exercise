package LeetCode_ADailyTopic;

import java.util.HashMap;

public class Lt_219 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int nums []  = {1,0,1,1};
		System.out.println(containsNearbyDuplicate(nums, 1));
	}

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int m = nums[i];
			if(map.get(m)==null) {
				map.put(m, i);
			}
			else {
				int tmp=map.get(m);
				map.put(m, i);
				res=i-tmp;
			}
			if(res!=0&&res<=k) {
				return true;
			}
		}
		return false;
    }

}
