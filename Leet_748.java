package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/10
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_748 {

    /*
    a b c d e f
    g h i j k
    l m n
    o p q
    r s t
    u v w x y z
     */
    public static void main(String[] args) {

    }

    /**
     * 字母表,
     * 先找到符合源字符串的选项，然后看长短，最后看下标
     *
     * @param licensePlate
     * @param words
     * @return
     */
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        String s = licensePlate.replaceAll("[^a-z]+", "");
        char[] toCharArray = s.toCharArray();
        String strAns = null;
        for (String word : words) {
            int[] wordArr = new int[26];
            word = word.toLowerCase();
            boolean flag = true;
            char[] chars = word.toCharArray();
            for (char aChar : chars) {
                wordArr[aChar - 'a']++;
            }
            for (char c : toCharArray) {
                wordArr[c - 'a']--;
                if (wordArr[c - 'a'] == -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (strAns == null || word.length() < strAns.length()) {
                    strAns = word;
                }
            }
        }
        return strAns;
    }
}
