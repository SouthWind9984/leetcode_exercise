package leetcode_exercise;

public class Lt_75 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums  = {2,0,2,1,1,0};
		sortColors(nums);
		for(int t:nums)
		System.out.print(t);
	}
	public static void sortColors(int[] nums) {
//		int tmp=nums[0];
//		boolean swap =true;
//		for(int i=0;i<nums.length-1;i++)
//		{
//			if (swap == false)         //若没有发生交换，则说明后面顺序已经排好。  
//		        break;
//		      swap = false;
//		      for (int j = 0; j < nums.length - 1 - i; j++) {
//		          if (nums[j] > nums[j + 1]) {
//		            nums[j + 1] = nums[j + 1] + nums[j];       // 先加后减
//		            nums[j] = nums[j + 1] - nums[j];
//		            nums[j + 1] = nums[j + 1] - nums[j];
//		            swap =true;            //表示发生了交换
//				}
//			}
//		}
    
		boolean swapp =true;
	    int indexOfLastUnsortedElement = nums.length-1;    //记录上次发生交换的位置
	    int  swappedIndex = -1;    //记录交换的位置
	    while(swapp)
	    {
	      swapp = false;
	      for (int i=0; i<indexOfLastUnsortedElement; i++)    //走到上次最后一个没有交换的元素位置
	      {
	        if (nums[i]> nums[i+1])
	         // 如果左边的数大于右边的数，则交换，保证右边的数字最大
	        {
	          int temp =nums[i];
	          nums[i]= nums[i+1];
	          nums[i+1] =temp;
	          // 表示发生了交换
	          swapp = true;
	          swappedIndex =i;
	            // 更新交换的位置
	        }
	      }
	      indexOfLastUnsortedElement = swappedIndex;
	    }
	
	
	}
}
