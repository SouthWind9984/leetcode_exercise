package LeetCode_ADailyTopic;

import java.util.HashMap;

public class Lt_mian16_02 {
    public static void main(String[] args) {

    }
    class WordsFrequency {
        private HashMap<String,Integer> map;
        public WordsFrequency(String[] book) {
            map = new HashMap<>();
            for (String str : book) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        public int get(String word) {
            return map.getOrDefault(word,0);
        }
    }
}
