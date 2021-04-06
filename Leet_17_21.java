package leetcode_exercise;

import java.util.Stack;

public class Leet_17_21 {
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] helight = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(helight);
    }
    /*
    0,1,0,2,1,0,1,3,2,1,2,1

    0 1 2 3 4 5 6 7
     */
    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int len = height.length;
        if(len==0) return 0;
        int area = 0;
        for (int i = 0; i < len; i++) {
            int number = height[i];
            while(!stack.isEmpty()&&number>=height[stack.peek()]){
                int top = stack.pop();
                if(stack.isEmpty()) break;
                int left = stack.peek();
                int wight =  i-left-1;
                int length = Math.min(height[left],number)-height[top];
                area += wight*length;
//                System.out.println(i +"  area = " + area);
            }
            stack.push(i);
        }
        return area;
    }
}
