package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/11/13 8:54
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_791 {

    public static void main(String[] args) {

    }

    class Solution {
        public String customSortString(String order, String s) {
            int[] words = new int[26];
            char[] chars = s.toCharArray();
//            记录s中字符出现的次数
            for (char aChar : chars) {
                words[aChar - 'a']++;
            }
            StringBuilder res = new StringBuilder();
            char[] orders = order.toCharArray();
//            遍历一次存在排序的字符
            for (char c : orders) {
                while (words[c - 'a'] > 0) {
                    res.append(c);
                    words[c - 'a']--;
                }
            }
//            最后拼接上剩下的字符
            for (int j = 0; j < words.length; j++) {
                int word = words[j];
                for (int i = 0; i < word; i++) {
                    res.append((char) ('a' + j));
                }
            }
            return res.toString();
        }
    }
}
