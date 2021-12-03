package LeetCode_ADailyTopic;


import java.util.Arrays;

public class Leet_1005 {
    public static void main(String[] args) {
        int[] nums = {2, -3, -1, 5, -4};
        System.out.println(largestSumAfterKNegations(nums, 4));
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        int sum = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0 && count < k) {
                nums[i] = -nums[i];
                count++;
            }
            sum += nums[i];
        }
        if (count < k) {
            Arrays.sort(nums);
            sum -= nums[0];
            while (count < k) {
                nums[0] = -nums[0];
                count++;
            }
            sum += nums[0];
        }
        System.out.println(Arrays.toString(nums));
        return sum;
    }
}
