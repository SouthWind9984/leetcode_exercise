package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/14 8:52
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_940 {
    public int distinctSubseqII(String s) {
        int mod = 1000000007;
        long[] code = new long[26];
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            long sum = 0;
            for (int j = 0; j < 26; j++) {
                sum = (sum + code[j]) % mod;
            }
            code[aChar - 'a'] = sum + 1;
        }
        long res = 0;
        for (long l : code) {
            res = (res + l) % mod;
        }
        return (int) res;
    }

}
