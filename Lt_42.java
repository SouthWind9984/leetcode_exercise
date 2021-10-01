package LeetCode_ADailyTopic;

import java.util.Stack;

public class Lt_42 {
    public static void main(String[] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(height);
    }
    /*
    单调栈思想，低柱子入栈，遇高柱弹栈
     */
    public static int trap(int[] height) {
        int len = height.length;
        if(len==0) return 0;
        int area = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            int h = height[i];
            while (!stack.isEmpty()&&h>=stack.peek()){
                    area += stack.pop();
            }
            stack.push(h);
            System.out.println(stack+"  "+area);
        }
        return 0;
    }

}
