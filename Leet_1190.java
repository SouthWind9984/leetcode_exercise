package LeetCode_ADailyTopic;

import java.util.Stack;

public class Leet_1190 {
    public static void main(String[] args) {
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));
    }

    /*
    反转没对括号中的字符串
     利用栈，先进后出。
     */
    public static String reverseParentheses(String s) {
        int len = s.length();
        if (len == 0) return "";
        StringBuilder res = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();
        stack.push(new StringBuilder());
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(new StringBuilder());
            } else if (ch == ')') {
                StringBuilder pop = stack.pop();
                stack.peek().append(pop.reverse());
            } else {
                stack.peek().append(ch);
            }
        }
        return stack.pop().toString();
    }
}
