package LeetCode_ADailyTopic;

import java.util.TreeMap;

public class Lt_1438 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {10,1,2,4,7,2};
//			{8,2,4,7};2
//		{10,1,2,4,7,2};5
//		{4,2,2,2,4,4,2,2}; 0
		System.out.println(longestSubarray(nums, 5));
	}

    /**
     * ThreeMap 比HashMap 多自然排列
     *
     * @param nums
     * @param limit
     * @return
     */

	public static int longestSubarray(int[] nums, int limit) {
        if (nums.length == 1) {
            return 1;
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        int right = 0, left = 0, res = 0;
        int len = nums.length;
        while (right < len) {
            treeMap.put(nums[right], treeMap.getOrDefault(nums[right], 0) + 1);
            if (treeMap.lastKey() - treeMap.firstKey() > limit) {
                treeMap.put(nums[left], treeMap.getOrDefault(nums[left], 0) - 1);
                if (treeMap.get(nums[left]) == 0) {
                    treeMap.remove(nums[left]);
                }
				left++;
			}
			res = Math.max(res, (right - left)+1);
			right++;
		}
		return res;
    }

}
