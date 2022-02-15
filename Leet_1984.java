package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/2/11
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1984 {

    public static void main(String[] args) {

    }

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            min = Math.min(min, nums[i + k - 1] - nums[i]);
        }
        return min;
    }

}
