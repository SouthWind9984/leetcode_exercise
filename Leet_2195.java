package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/3/13
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_2195 {

    public long minimalKSum(int[] nums, int k) {
        long res = 0;
        int tmp = 1;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num < k) {
                k++;
            }
        }

        return res;
    }
}
