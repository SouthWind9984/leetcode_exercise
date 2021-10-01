package LeetCode_ADailyTopic;

public class Lt_643 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根


        int [] nums = {1,12,-5,-6,50,3};
		double res = findMaxAverage(nums, 6);
		System.out.println(res);
	}

    public static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }

        return max * 1.0 / k;
    }

}
