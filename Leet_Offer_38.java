package LeetCode_ADailyTopic;

import java.util.LinkedList;
import java.util.List;

public class Leet_Offer_38 {
    public static void main(String[] args) {
        permutation("123");
    }

    public static String[] permutation(String s) {
        List<String> list = new LinkedList<>();
        backshock(list, s, 0);
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void backshock(List<String> list, String s, int pos) {
        if (pos == s.length()) {
            list.add(s);
        }
        for (int i = pos; i < s.length(); i++) {
            boolean b = true;
            for (int j = pos; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    b = false;
                    break;
                }
            }
            if (b) {
                s = swap(s, pos, i);
                backshock(list, s, pos + 1);
                s = swap(s, pos, i);
            }
        }
    }

    public static String swap(String str, int a, int b) {
        char[] chars = str.toCharArray();
        char tmp = chars[a];
        chars[a] = chars[b];
        chars[b] = tmp;
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar);
        }
        return sb.toString();
    }
}
