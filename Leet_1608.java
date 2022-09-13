package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/9/12
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1608 {

    public static void main(String[] args) {

    }

    class Solution {
        public int specialArray(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            int min = 1;
            int max = nums[len - 1];
            for (int i = min; i <= max; i++) {
                int sum = 0;
                for (int num : nums) {
                    if (num >= i) {
                        sum++;
                    }
                    if (sum == i)
                        return i;
                }

            }
            return -1;
        }
    }

}
