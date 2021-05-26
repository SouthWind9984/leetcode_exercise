package leetcode_exercise;

import java.util.Deque;
import java.util.LinkedList;

public class Leet_1190 {
    public static void main(String[] args) {
        String s = "a(bcdefghijkl(mno)p)q";
        System.out.println(reverseParentheses(s));
    }

    /*
    反转没对括号中的字符串
     利用栈，先进后出。
     */
    public static String reverseParentheses(String s) {
        int len = s.length();
        if (len == 0) return "";
        Deque<Character> deque = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        int n = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == '(') n++;
            if (ch != ')') {
                deque.offerLast(ch);
            }
            if (ch == ')') {
                String ss = "";
                while (!deque.isEmpty()) {
                    char pop = deque.pollLast();
                    if (pop == '(') {
                        n--;
                        break;
                    } else {
                        ss += pop;
                    }
                }
                for (int j = 0; j < ss.length(); j++) {
                    deque.addLast(ss.charAt(j));
                }
            }
        }
        while (!deque.isEmpty()) {
            res.append(deque.pollFirst());
        }
        return res.toString();
    }
}
