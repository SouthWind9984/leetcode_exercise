package LeetCode_ADailyTopic;

public class Lt_485 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] nums = {1,1,0,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));

	}
	public static int findMaxConsecutiveOnes(int[] nums) {


        int max=0;
		int zero1=0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==0) {
				max=Math.max(max, i-zero1);
				zero1=i+1;
			}

        }

        if(nums[nums.length-1]!=0) {
			max=Math.max(max, nums.length-zero1);
		}
		return max;

    }

}
