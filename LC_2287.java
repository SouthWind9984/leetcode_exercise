package LeetCode_ADailyTopic;

/**
 * 2023/1/13 11:20
 * SouthWind
 * github.com/SouthWind9984
 * 编程千万条，规范第一条
 */
public class LC_2287 {

    public int rearrangeCharacters(String s, String target) {
        char[] chars = s.toCharArray();
        char[] tarChars = target.toCharArray();
        int [] tarNum = new int[26];
        int [] sNum = new int[26];
        int min  = 100;
        for (char tarChar : tarChars) {
            tarNum[tarChar - 'a']++;
        }
        for (char aChar : chars) {
            sNum[aChar - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            int tN = tarNum[i];
            int sN = sNum[i];
            if (tN == 0) continue;
            if (sN == 0) return 0;
            int n = sN / tN;
            min = Math.min(n,min);
        }
        return min;
    }
}
