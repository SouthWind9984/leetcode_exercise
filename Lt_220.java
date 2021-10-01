package LeetCode_ADailyTopic;

public class Lt_220 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {-2147483648,2147483647};
		System.out.println(containsNearbyAlmostDuplicate(nums, 1, 1));
	}
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if(nums.length<=1)
			return false;
		for (int i = 0; i < nums.length; i++) {
			long m = nums[i];
			for (int j = 0; j < nums.length; j++) {
				long n = nums[j];
				if(i!=j&&Math.abs(m-n)<=t&&Math.abs(i-j)<=k)
					return true;
			}
		}
		return false;
    }

}
