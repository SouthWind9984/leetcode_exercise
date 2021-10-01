package LeetCode_ADailyTopic;

public class Lt_152 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] nums = {3,-1,4};
		System.out.println(maxProduct(nums));
	}
	public static int maxProduct(int[] nums) {
		//滑动窗口
		int len = nums.length;
		 if(len==1){
	            return nums[0];
	        }
		int res = 0;
		int max = 0;
		int left = 0;
		int right = 0;
		while(right<len){

		}
		return res;
    }
}
