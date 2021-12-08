package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2021/12/7
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_2006 {
    public static void main(String[] args) {

    }

    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        int left = 0;
        int right = 1;
        while (right < len) {
            if (nums[left] == nums[right]) {
                right++;
            } else {
                int n = nums[right] - nums[left];
                if (Math.abs(n) == k) {
                    sum += right - left + 1;
                }
                left = right;
            }
        }
        return sum;
    }
}
