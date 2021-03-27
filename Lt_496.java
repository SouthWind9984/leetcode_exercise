package leetcode_exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Lt_496 {

    public static void main(String[] args) {

        int nums1 []  = {4,1,2};
        int nums2 []  = {1,3,4,2};
        System.out.println(nextGreaterElement(nums1,nums2));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] res = new int [nums1.length];
//        Arrays.fill(res,-1);
//        baoli(nums1, nums2, res);
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        stack.add(nums2[0]);
        for (int i = 1; i < nums2.length; i++) {
            while(!stack.empty()){
                if(nums2[i]>stack.peek()){
                    map.put(stack.pop(),nums2[i]);
                }
                else
                    break;
            }
            stack.add(nums2[i]);
        }
        stack.clear();
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
    }

    private static void baoli(int[] nums1, int[] nums2, int[] res) {
        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                int m = nums2[j];
                if(n==m){
                    for (int k = j+1; k < nums2.length; k++) {
                        int tmp = nums2[k];
                        if(tmp>m){
                            res[i]=tmp;
                            break;
                        }
                    }
                }
            }
        }
    }

}
