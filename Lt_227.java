package leetcode_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Lt_227 {
    public static void main(String[] args) {
        String s ="1+2-3+4/2*3+9";
        calculate(s);
    }
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        s=s.replaceAll("[\\s]","");
        s=s.replaceAll("//","/");
        String[] nums = s.split("\\*|/|\\+|-");
        String sign = s.replaceAll("[0-9]","");
        int res = 0;
        stack.add(Integer.parseInt(nums[0]));
        for (int i = 0; i < sign.length(); i++) {
            if(sign.charAt(i)=='*'){
                stack.add(stack.pop()*Integer.parseInt(nums[i+1]));
            }
            else if(sign.charAt(i)=='/'){
                stack.add(stack.pop()/Integer.parseInt(nums[i+1]));
            }
            else if(sign.charAt(i)=='-'){
                stack.add(Integer.parseInt(nums[i+1])*-1);
            }
            else{
                stack.add(Integer.parseInt(nums[i+1]));
            }
            System.out.println("stack = " + stack);
        }
        while(!stack.empty())
            res+=stack.pop();
        System.out.println("res = " + res);
        return res;
    }
}
