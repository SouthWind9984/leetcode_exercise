package leetcode_exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet_1239 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");
        // uniq unue unique ique
        maxLength(arr);
    }

    public static int maxLength(List<String> arr) {
        //回溯算法
        List<String> marks = new LinkedList<>();
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            StringBuilder res = new StringBuilder();
            for (int j = i; j < size; j++) {
                res.append(arr.get(j));
            }
            marks.add(String.valueOf(res));
            System.out.println("res = " + res);
        }
        return 0;
    }
}
