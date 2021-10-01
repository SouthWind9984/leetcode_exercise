package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Leet_1838 {
    public static void main(String[] args) {

    }

    public int maxFrequency(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        int len = nums.length;
        //双指针，一块一慢
        for (int i = 0; i < len; i++) {
            int n = k;
            int count = 1;
            for (int j = i + 1; j <= len; j++) {
                n -= Math.abs(nums[j] - nums[i]);
                if (n < 0) break;
                count++;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
