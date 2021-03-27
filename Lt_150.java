package leetcode_exercise;

import java.util.Stack;

public class Lt_150 {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int len = tokens.length;
        for (int i = 0; i < len; i++) {
            String str = tokens[i];
            stack.push(str);
            if(str.matches("[^0-9]")){
                stack.push(polish(stack.pop(),stack.pop(),stack.pop()));
            }
        }
        return Integer.parseInt(stack.pop());
    }
    public static String polish(String C,String B,String A){
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        switch (C){
            case "+":
                return String.valueOf(a+b);
            case "-":
                return String.valueOf(a-b);
            case "*":
                return String.valueOf(a*b);
            default:
                return String.valueOf(a/b);
        }
    }

}
