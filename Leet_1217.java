package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/7/8
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1217 {
    class Solution {
        public int minCostToMoveChips(int[] position) {
            int queer = 0;
            int pair = 0;
            for (int i : position) {
                if (i % 2 == 0) pair++;
                else queer++;
            }
            return Math.min(pair, queer);
        }
    }

}
