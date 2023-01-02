package LeetCode_ADailyTopic;

/**
 * 2023/1/1 19:53
 * SouthWind
 * github.com/SouthWind9984
 * 编程千万条，规范第一条
 */
public class LC_2351 {
    public static void main(String[] args) {

    }
    public char repeatedCharacter(String s) {
        int [] chars = new int[26];
        for (char c : s.toCharArray()) {
            if (chars[c-'a']==1)return c;
            chars[c-'a']++;
        }
        return 0;
    }
}
