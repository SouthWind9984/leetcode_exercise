package leetcode_exercise;

import java.util.Arrays;

/**
 * 
 * @author SouthWind
 *	给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Lt_53 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {-2,-1};
		int res = maxSubArray(arr);
		System.out.println(res);
	}
	public static int maxSubArray(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		
//		int befor_sum=0; 	//之前
		int now_sum=0;		//当前
		int max_sum=nums[0];		//最大
		for (int j : nums) {
			if(now_sum<=0) {
				now_sum=j;
			}
			else {
				now_sum+=j;
			}
			if(now_sum>max_sum)
				max_sum=now_sum;
		}
		return max_sum;
		
//		int ans = nums[0];
//        int sum = 0;
//        for(int num: nums) {
//            if(sum > 0) {
//                sum += num;
//            } else {
//                sum = num;
//            }
//            ans = Math.max(ans, sum);
//        }
//        return ans;
//        
    }
}
