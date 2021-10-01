package LeetCode_ADailyTopic;

public class Lt_283 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}

    public static void moveZeroes(int[] nums) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			if(n!=0) {
				nums[i]=nums[count];
				nums[count]=n;
				count++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			System.out.println(j+"  ");
		}
    }

}
