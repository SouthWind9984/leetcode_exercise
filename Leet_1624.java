package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/9/17 10:49
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1624 {
    public static void main(String[] args) {

    }

    class Solution {
        public int maxLengthBetweenEqualCharacters(String s) {
            int len = s.length();
            int res = -1;
            char[] chars = s.toCharArray();
            for (int i = 0; i < len; i++) {
                char c = chars[i];
                int index = s.lastIndexOf(c);
                int k = index - i - 1;
                res = Math.max(k, res);
            }
            return res;
        }
    }
}
