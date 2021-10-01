package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Leet_1877 {
    public static void main(String[] args) {

    }

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < len / 2; i++) {
            res = Math.max(res, nums[i] + nums[len - i - 1]);
        }
        return res;
    }
}
