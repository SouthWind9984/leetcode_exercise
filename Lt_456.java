package LeetCode_ADailyTopic;

import java.util.Stack;

public class Lt_456 {
    public static void main(String[] args) {
        int[] nums ={1,0,1,-4,-3};
        System.out.println(find132pattern(nums));
    }
    /*
    132模式
    i<j<k
    a b c
    -----
    a c b
    1 3 2
    不相邻也符合条件
     */
    public static boolean find132pattern(int[] nums) {

        int len =nums.length;
        if(len<3){
            return false;
        }
        /**
         * 小元素尽可能压到底
         *
         * 采用后遍历，找最小
         * 前遍历，找最大
         *
         * 1 3 2
         */
//        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;  //保存1
        Stack<Integer> stack = new Stack<>(); //保存2
        int last = Integer.MIN_VALUE; //保存3
        for (int i = len-1; i >= 0; i--) {
            int value = nums[i];
            if(value<last){
                return true;
            }
            while(!stack.isEmpty()&&stack.peek()<value){
                System.out.println(stack);
                last = stack.pop();
            }
            stack.push(value);
        }
        return false;
    }
}
