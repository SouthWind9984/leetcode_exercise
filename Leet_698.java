package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/9/20 7:54
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_698 {

    public static void main(String[] args) {

    }

    /*

   1 2 3 4 5 5
     */

    class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int len = nums.length;
            int sum = 0;
            Arrays.sort(nums);
            for (int num : nums) {
                sum += num;
            }
            if (sum % k == 0) return true;
            return false;
        }
    }
}
