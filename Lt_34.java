package leetcode_exercise;
/**
 * 
 * @author SouthWind
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回 [-1, -1]。

进阶：

你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Lt_34 {
	public static void main(String[] args) {
		int [] arr = {5,7,7,8,8,10};
		int [] res = searchRange(arr, 8);
		for (int i : res) {
			System.out.println(i);
		}
		
	}
	
	 public static int[] searchRange(int[] nums, int target) {
		 int res [] = {-1,-1};
		 if(nums.length==0) {
			 return res;
		 }
		 int left =0;
		 int right = nums.length;
		 int mid = (left+right)/2; //中间值
		 boolean falg = false;
		 while(left!=right) {
			 if(target>nums[mid]) {
				 left=++mid;
				 mid=(right+left)/2;
				 falg = true;
			 }
			 else if(target<nums[mid]) {
				 right=--mid;
				 mid=(right+left)/2;
			 }
			 else if(target==nums[mid]) {
				 break;
			 }
			 else {
				return res;
			 }
				 
		 }
		 
		 if(falg) {
			 for(int i= mid;i<nums.length;i++) {
				 if(nums[i]==target) {
					 res[1]=i;
				 }
				 else {
					 res[0]=mid;
					 break;
				 }
			 }
		 }
		 else {
			 for(int i= mid;i>0;i--) {
				 if(nums[i]==target) {
					 res[1]=i;
				 }
				 else {
					 res[0]=mid;
					 break;
				 }
			 }
		 }
		 return res;
	    }
	
}
