package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map;

public class Leet_523 {
    public static void main(String[] args) {

    }

    public boolean checkSubarraySum(int[] nums, int k) {
        //前缀和+哈希表 +同余定理：i%m - j%m = (i-j)%m，
        int len = nums.length;
        if (len < 2)
            return false;
        //连续两个零 返回true
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0)
                return true;
        }
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); //防止 nums[0]
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            int m = sum % k;
            if (map.containsKey(m)) {
                if (i - map.get(m) > 1) return true;
            } else {
                map.put(m, i);
            }
        }
        return false;
    }
}
