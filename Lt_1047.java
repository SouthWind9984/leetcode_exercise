package LeetCode_ADailyTopic;

import java.util.Stack;

public class Lt_1047 {
    public static void main(String[] args) {

        String s = "abbacccd";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if(!stack.empty()&&stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else
                stack.add(s.charAt(i));
        }
        len = stack.size()-1;
//        System.out.println(stack.toString());
        Object[] array = stack.toArray();
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res+=array[i];
        }
        return res;
    }
}
