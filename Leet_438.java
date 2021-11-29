package LeetCode_ADailyTopic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_438 {

    public static void main(String[] args) {
        String str = "cbaebabacd";
        String p = "abc";
        List<Integer> anagrams = findAnagrams(str, p);

    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> listAns = new ArrayList<>();
        char[] pSort = p.toCharArray();
        Arrays.sort(pSort);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int index = p.indexOf(c);
            if (index != -1 && i + p.length() <= s.length()) {
                String substring = s.substring(i, i + p.length());
                char[] chars = substring.toCharArray();
                Arrays.sort(chars);
                if (Arrays.equals(chars, pSort)) {
                    listAns.add(i);
                }
            }
        }
        return listAns;
    }

    public static List<Integer> findAnagrams2(String s, String p) {
        List<Integer> listAns = new ArrayList<>();
        char[] pSort = p.toCharArray();
        Arrays.sort(pSort);
        int len = s.length();
        int left = 0;
        int right = p.length();
        while (right <= len) {
            String substring = s.substring(left, right);
            char[] chars = substring.toCharArray();
            Arrays.sort(chars);
            if (Arrays.equals(chars, pSort)) {
                listAns.add(left);
            }
            left++;
            right++;
        }
        return listAns;
    }
}
