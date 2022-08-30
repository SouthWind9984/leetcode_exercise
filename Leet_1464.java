package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/8/27
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1464 {
    class Solution {
        public int maxProduct(int[] nums) {
            Arrays.sort(nums);
            return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        }
    }
}
