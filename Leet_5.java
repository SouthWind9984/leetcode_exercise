package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/6 13:26
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_5 {

    public static void main(String[] args) {
        System.out.println();
    }

    //暴力解法
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        if (length == 1) return s;
        int maxLen = 1;
        int begin = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (j - i + 1 > maxLen && isPalindrome(chars, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    static boolean isPalindrome(char[] chars, int i, int j) {
        while (i < j) {
            if (chars[i] != chars[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
