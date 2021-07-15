package leetcode_exercise;

import java.util.HashMap;

public class Leet_451 {
    public static void main(String[] args) {
        frequencySort("aaaccc");
    }

    public static String frequencySort(String s) {
        int[] arr = new int[26];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int h = c - 97;
            arr[h]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {

        }
        return s;
    }
}
