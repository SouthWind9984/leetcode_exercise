package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SouthWind
 * @date 2021/12/4
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_383 {

    public static void main(String[] args) {
        String str1 = "aaazzz";
        String str2 = "aaazzz";
        canConstruct_1(str1, str2);
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char key = magazine.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char key = ransomNote.charAt(i);
            if (map.containsKey(key)) {
                Integer count = map.get(key);
                if (count == 0) return false;
                map.put(key, count - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct_1(String ransomNote, String magazine) {
        int[] words = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            int c = magazine.charAt(i) - 'a';
            words[c]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int c = ransomNote.charAt(i) - 'a';
            words[c]--;
            if (words[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
