package LeetCode_ADailyTopic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SouthWind
 * @date 2022/2/1
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1763 {


    public String longestNiceSubstring(String s) {
        int max = 0, n = s.length();
        char[] chars = s.toCharArray();
        String res = "";
        for (int i = 0; i < n; i++) {
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();
            for (int j = i; j < n; j++) {
                set1.add(chars[j]);
                set2.add((char) (chars[j] | 32));
                if (set1.size() == set2.size() * 2 && j - i + 1 > max) {
                    //是美好的
                    max = j - i + 1;
                    res = s.substring(i, j - i + 1);
                }
            }
        }
        return res;
    }
}
