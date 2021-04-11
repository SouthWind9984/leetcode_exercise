package leetcode_exercise;

import java.util.Stack;

public class Leet_20 {
    public static void main(String[] args) {

    }
    /*
    [ ( { } ) ]
     */
    public boolean isValid(String s) {
        //入栈运算
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
            if (!stack.isEmpty()){
                if (stack.peek()==')'){
                    if(stack.pop()==')'&&stack.pop()!='(')
                        return false;
                }
                else if (stack.peek()=='}'){
                    if(stack.pop()=='}'&&stack.pop()!='{')
                        return false;
                }
                else if (stack.peek()==']'){
                    if(stack.pop()==']'&&stack.pop()!='[')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
