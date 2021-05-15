package leetcode_exercise;

public class Leet_713 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6, 7, 1};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int prod = 1;
        int res = 0;
        for (int i = 0; i < len; i++) {
            prod *= nums[i];
            while (prod >= k) {
                prod /= nums[left++];
            }
            res += i - left + 1;
        }
        return res;
    }
}
