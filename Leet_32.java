package LeetCode_ADailyTopic;

import java.util.Stack;

public class Leet_32 {
    public static void main(String[] args) {

    }
    public int longestValidParentheses(String s) {
        //入栈
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
            while(stack.size()>1&&stack.peek()==')'){
                if (stack.pop()==')'&&stack.pop()=='(')
                    res+=2;
            }
        }
        return res;
    }
}
