package LeetCode_ADailyTopic;

import java.util.Comparator;
import java.util.List;

/**
 * @author SouthWind
 * @date 2022/7/8
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_648 {

    class Solution {
        public String replaceWords(List<String> dictionary, String sentence) {
            StringBuilder ansStr = new StringBuilder();
            String[] strings = sentence.split(" ");
            dictionary.sort(Comparator.comparingInt(String::length));
            for (String s : strings) {
                boolean flag = false;
                for (String s1 : dictionary) {
                    if (s.startsWith(s1)) {
                        ansStr.append(s1).append(" ");
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    ansStr.append(s).append(" ");
                }
            }
            return ansStr.delete(ansStr.length() - 1, ansStr.length()).toString();
        }
    }
}
