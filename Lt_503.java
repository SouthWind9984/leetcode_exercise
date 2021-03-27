package leetcode_exercise;

import java.util.*;

public class Lt_503 {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.add(1);
//        stack.add(3);
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.get(0));
//        System.out.println(stack.peek());
        int [] nums = {1,3,2,4,6,2,4,4};
        nums = nextGreaterElements(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"  ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> stack = new Stack<>();
        int len =nums.length;
        for (int i = 0; i < len * 2; i++) {
            while(!stack.empty()){
                if(nums[i%len]>nums[stack.peek()]){
                    res[stack.pop()]=nums[i%len];
                }
                else
                    break;
            }
            stack.push(i%len);
        }
        return res;
    }
}
