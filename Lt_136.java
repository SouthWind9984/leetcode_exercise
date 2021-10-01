package LeetCode_ADailyTopic;

public class Lt_136 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int arr [] = {4,1,2,1,2};

        int n = singleNumber(arr);
		System.out.println(n);
	}

    public static int singleNumber(int[] nums) {
		 int res = nums[0];
		 if(nums.length==1)
			 System.out.println(nums[0]);

         else {
			 for(int i=1;i<nums.length;i++)
			 {
				res^=nums[i];
			 }

         }
		 return res;
    }

}
