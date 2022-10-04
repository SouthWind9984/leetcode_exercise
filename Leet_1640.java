package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SouthWind
 * @date 2022/9/22 14:51
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1640 {

    class Solution {
        public boolean canFormArray(int[] arr, int[][] pieces) {
            int len = arr.length;
            Map<Integer, int[]> map = new HashMap<>();
            for (int[] piece : pieces) {
                map.put(piece[0], piece);
            }
            for (int i = 0; i < len; ) {
                int n = arr[i];
                if (!map.containsKey(n))
                    return false;
                int[] values = map.get(n);
                for (int value : values) {
                    if (arr[i++] != value)
                        return false;
                }
            }
            return true;
        }
    }
}
