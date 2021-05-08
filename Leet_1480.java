package leetcode_exercise;

public class Leet_1480 {
    public static void main(String[] args) {

    }


    public int[] runningSum(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
