package leetcode_exercise;

import java.util.Arrays;

public class Leet_137 {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int i = 0;
        for (; i < len - 1; ) {
            System.out.println(nums[i]);
            if (nums[i] == nums[i + 1]) {
                i += 3;
            } else return nums[i];
        }
        return nums[i];
    }
}
