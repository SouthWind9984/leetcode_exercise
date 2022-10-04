package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/2 9:41
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_674 {
    public static void main(String[] args) {

    }

    class Solution {
        /*
        滑动窗口
         */
        public int findLengthOfLCIS(int[] nums) {
            int len = nums.length;
            int l = 0;
            int r = 0;
            int res = 0;
            while (r < len) {
                // 找到下一位不递增的情况
                if (r > 0 && nums[r - 1] >= nums[r]) {
                    l = r;
                }
                res = Math.max(res, r - l + 1);
                r++;
            }
            return res;
        }
    }
}
