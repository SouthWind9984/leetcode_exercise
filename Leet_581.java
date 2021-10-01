package LeetCode_ADailyTopic;

public class Leet_581 {
    public static void main(String[] args) {

    }

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, nums[i]);
            if (max != nums[i]) {
                end = i;
            }
        }
        int min = Integer.MAX_VALUE;
        int start = 0;
        for (int i = len - 1; i >= 0; i--) {
            min = Math.min(nums[i], min);
            if (min != nums[i]) {
                start = i - 1;
            }
        }
        return end - start;
    }
}
