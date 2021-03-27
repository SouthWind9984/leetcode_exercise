package leetcode_exercise;

import java.util.Arrays;

public class Lt_1365 {
	
	public static void main(String[] args) {
		
		int arr[] = {8,1,2,2,3};
		int nums []= smallerNumbersThanCurrent(arr);
		for(int t:nums)
			System.out.println(t);
	}
	
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
		 int arr[] =new int[nums.length];
		   for(int i=0;i<nums.length;i++)
		   {
			   for(int j=0;j<nums.length;j++)
				   if(nums[i]>nums[j])
					   arr[i]++;
		   }
		   return arr;
	 }

}
