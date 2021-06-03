package leetcode_exercise;

import java.util.HashMap;
import java.util.Map;

public class Leet_525 {
    public static void main(String[] args) {

    }

    /*
      -1 1 1 1 -1  1 -1
      */
    public int findMaxLength(int[] nums) {
        int len = nums.length;
        if (len < 1) return 0;
        int sum = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) sum += -1;
            else sum += 1;
            if (map.containsKey(sum)) {
                res = Math.max(res, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println("map = " + map);
        return res;
    }
}
