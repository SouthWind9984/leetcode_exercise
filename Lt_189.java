package leetcode_exercise;

public class Lt_189 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int	[] nums = {1,2,3,4,5,6,7};
		rotate(nums, 3);
	}
	public static void rotate(int[] nums, int k) {
		if(k==0) {
			return;
		}
		for (int i = 0; i <k; i++) {
			int tmp = nums[nums.length-1];
			for (int j =nums.length-1; j >0 ; j--) {
				nums[j]=nums[j-1];
			}
			nums[0]=tmp;
		}
//		for(int t: nums) {
//			System.out.println(t);
//		}
    }
}
