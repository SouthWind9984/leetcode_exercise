package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map.Entry;

public class Lt_Offer56_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {4,1,4,6};
		nums = singleNumbers(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static int[] singleNumbers(int[] nums) {


        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
			if(map.get(i)==2) {
				map.remove(i);
			}
		}
		int [] res = new int[2];
		int n=0;
		for(Entry<Integer, Integer> entrySet : map.entrySet()) {
			res[n++]=entrySet.getKey();
		}
		return res;
    }


}
