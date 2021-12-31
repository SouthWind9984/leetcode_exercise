package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2021/12/26
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1078 {
    public static void main(String[] args) {

    }

    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list = new ArrayList<>();
        String[] split = text.split(" ");
        System.out.println(Arrays.toString(split));
        int len = split.length;
        for (int i = 0; i < len - 2; i++) {
            String a = split[i];
            String b = split[i + 1];
            String c = split[i + 2];
            if (a.equals(first) && b.equals(second)) {
                list.add(c);
            }
        }
        System.out.println(list);
        return list.toArray(new String[0]);
    }

    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String sentence : sentences) {
            ans = Math.max(ans, sentence.split(" ").length);
        }
        return ans;
    }
}
