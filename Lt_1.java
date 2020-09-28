package leetcode_exercise;

public class Lt_1 {
	
	public static int[] twoSum(int[] nums, int target) {
		int [] array = new int [2];
		boolean f=false;
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]==target-nums[i]) {
					array[0]=i;
					array[1]=j;
					f=true;
					break;
				}
			}
			if(f)
				break;
		}
		System.out.println(array[0]+"  "+array[1]);
		return array;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {2,7,11,15};
		twoSum(arr, 9);
	}

}
