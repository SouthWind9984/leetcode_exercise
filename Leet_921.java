package LeetCode_ADailyTopic;

import java.util.Stack;

/**
 * @author SouthWind
 * @date 2022/10/4 10:11
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_921 {
    public static void main(String[] args) {
        minAddToMakeValid("()))((");
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            stack.push(aChar);
            while (stack.size() > 1) {
                Character pop = stack.pop();
                Character peek = stack.peek();
                if ((peek == '(' && pop == ')')) {
                    stack.pop();
                } else {
                    stack.push(pop);
                    break;
                }
            }
//            System.out.println(stack);
        }
        return stack.size();
    }
}
