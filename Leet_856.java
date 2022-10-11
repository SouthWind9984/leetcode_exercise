package LeetCode_ADailyTopic;

import java.util.Stack;

/**
 * @author SouthWind
 * @date 2022/10/9 17:13
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_856 {
    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(scoreOfParentheses(s));
    }

    public static int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int ans = 0;
        boolean flag = true;
        for (char c : chars) {
            if (c == '(') {
                stack.push(c);
                flag = true;
            } else {
                if (flag) {
                    ans += Math.pow(stack.size() - 1, 2);
                    flag = false;
                    System.out.println(ans);
                }
                stack.pop();
            }
        }
        return ans;
    }
}
