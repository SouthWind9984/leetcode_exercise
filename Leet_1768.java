package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/23 8:20
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1768 {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            char[] chars1 = word1.toCharArray();
            char[] chars2 = word2.toCharArray();
            StringBuilder resBuilder = new StringBuilder();
            int len1 = chars1.length;
            int len2 = chars2.length;
            int len = Math.min(len1, len2);
            for (int i = 0; i < len; i++) {
                resBuilder.append(chars1[i]).append(chars2[i]);
            }
            resBuilder.append(new String(chars1, len, len1 - len));
            resBuilder.append(new String(chars2, len, len2 - len));
            return resBuilder.toString();
        }
    }
}
