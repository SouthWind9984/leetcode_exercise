package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/7 9:56
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1800 {

    public int maxAscendingSum(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        int max = -1;
        int tmp = nums[0];
        for (int i = 0, j = 1; j < len; i++, j++) {
            if (nums[j] > nums[i]) {
                tmp += nums[j];
            } else {
                max = Math.max(max, tmp);
                tmp = nums[i];
            }
        }
        return Math.max(max, tmp);
    }

}
