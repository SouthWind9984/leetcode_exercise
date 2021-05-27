package leetcode_exercise;

import java.util.Arrays;

public class Leet_908 {
    public static void main(String[] args) {

    }

    public int smallestRangeI(int[] nums, int k) {
        int len = nums.length;
        if (len == 1) return 0;
        Arrays.sort(nums);
        int n = nums[0];
        int m = nums[len - 1];
        if (m - n >= 2 * k) return 0;
        else return m - n - 2 * k;
    }
}
