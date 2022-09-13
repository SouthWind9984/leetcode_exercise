package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/9/14
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1619 {

    class Solution {
        public double trimMean(int[] arr) {
            int len = arr.length;
            Arrays.sort(arr);
            int n = (int) (len * 0.05);
            int sum = 0;
            for (int i = n; i < len - n; i++) {
                sum += arr[i];
            }
            return (sum * 1.0) / (len * 0.9);
        }
    }

}
