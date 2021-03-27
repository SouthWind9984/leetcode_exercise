package leetcode_exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lt_215 {
    public static void main(String[] args) {
        int [] nums = {3,2,3,1,2,4,5,5,6};
        findKthLargest(nums,4);
    }
    public static int findKthLargest(int[] nums, int k) {

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            treeMap.put(nums[i],treeMap.getOrDefault(nums[i],0)+1);
        }
        System.out.println(treeMap);
        int n = 0;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            //9 - 4 = 5
            if (n == nums.length-k) {
                return entry.getKey();
            }
            n+=entry.getValue();
        }
        return 0;
    }

}
