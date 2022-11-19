package LeetCode_ADailyTopic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SouthWind
 * @date 2022/11/11 9:18
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1704 {

    public boolean halvesAreAlike(String s) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        Set<Character> set = new HashSet<>();
        for (char c : vowel) {
            set.add(c);
        }
        char[] chars = s.toLowerCase().toCharArray();
        int len = s.length();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < len / 2; i++) {
            if (set.contains(chars[i]))
                count1++;
            if (set.contains(chars[len - i - 1]))
                count2++;

        }
        return count1 == count2;
    }
}
