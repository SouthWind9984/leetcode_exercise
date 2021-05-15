package leetcode_exercise;

import java.util.ArrayList;
import java.util.List;

public class Leet_17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("37"));
    }

    /*
    电话号码的组成

    2 —— abc
    3 —— def
     */
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        String[] words = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int len = digits.length();
        for (int i = 0; i < len; i++) {
            int dif = (Integer.parseInt("" + digits.charAt(i)) - 2);
            int size = list.size();
            List<String> list1 = new ArrayList<>();
            if (size == 0) {
                for (int k = 0; k < words[dif].length(); k++) {
                    list1.add("" + words[dif].charAt(k));
                }
            } else {
                for (String s : list) {
                    for (int k = 0; k < words[dif].length(); k++) {
                        list1.add(s + words[dif].charAt(k));
                    }
                }
            }
            list = list1;
        }
        return list;
    }
}
