package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map;

public class Leet_1525 {
    public static void main(String[] args) {

        System.out.println(numSplits("aacaba"));
    }

    public static int numSplits(String s) {
        int len = s.length();
        int res = 0;
        Map<Character, Integer> left = new HashMap<>();
        int[] pre = new int[s.length() + 1];
        for (int i = 1; i <= len; i++) {
            left.put(s.charAt(i - 1), 0);
            pre[i] = left.size();
        }
        Map<Character, Integer> right = new HashMap<>();
        for (int i = len - 1; i >= 1; i--) {
            char c = s.charAt(i);
            right.put(c, 0);
            if (pre[i] == right.size()) res++;
        }
//        System.out.println(Arrays.toString(pre));
        return res;
    }
}
