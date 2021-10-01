package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Lt_628 {

	public static void main(String[] args) {
		int []	nums = {-8,-7,-2,10,20};
		int sum = maximumProduct(nums);
		System.out.println(sum);
	}


    public static int maximumProduct(int[] nums) {
		 int res=1;
		 if(nums.length==3) {
			for (int i = 0; i < nums.length; i++) {
				int j = nums[i];
				res*=j;
			}
			return res;
		 } else {
			 Arrays.sort(nums);
			 for (int i : nums) {
				System.out.print(i+"\t");
			}
			 int len = nums.length;
			 System.out.println();
//			 if(Math.abs(nums[1])>=nums[len-2]) {
//				 res=nums[0]*nums[1]*nums[len-1];
//			 }
//			 else {
//				 res=nums[len-3]*nums[len-2]*nums[len-1];
//			 }
			 res=Math.max((nums[0]*nums[1]*nums[len-1]),(nums[len-3]*nums[len-2]*nums[len-1]));
		 }
		 return res;
	 }

}
