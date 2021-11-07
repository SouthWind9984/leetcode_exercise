package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SouthWind
 */
public class Leet_500 {
    public static void main(String[] args) {

    }

    public String[] findWords(String[] words) {
        String[] lines = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>(26);
        ArrayList<String> resList = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            for (int j = 0; j < line.length(); j++) {
                map.put(line.charAt(j), i);
            }
        }
        for (String s : words) {
            String word = s.toLowerCase();
            int index = map.get(word.charAt(0));
            for (int j = 1; j < word.length(); j++) {
                char charAt = word.charAt(j);
                int tmp = map.get(charAt);
                if (index != tmp) {
                    word = "";
                    break;
                }
            }
            if (!"".equals(word)) {
                resList.add(word);
            }
        }
        return resList.toArray(new String[0]);
    }
}
