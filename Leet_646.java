package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/9/3
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_646 {

    public static void main(String[] args) {

    }

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (o1, o2) -> o1[0] - o2[0]);
        System.out.println(Arrays.deepToString(pairs));
        int len = pairs.length;
        int res = 0;
        int cur = pairs[0][1];
        for (int i = 1; i < len; i++) {
            if (pairs[i][0] > cur) {
                res++;
                cur = pairs[i][1];
            }
        }
        return res;
    }

}
