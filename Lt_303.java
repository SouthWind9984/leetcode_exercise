package leetcode_exercise;

public class Lt_303 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	
	}
}


class NumArray {
	
	int [] arr;
    public NumArray(int[] nums) {
        arr = nums;
         if(nums.length == 0)
        	 return;
         else {
        	 int sum =0;
        	 for (int i = 0; i < nums.length; i++) {
        		 sum+=nums[i];
        		 arr[i]=sum;
			}
         }
    }
    
    public int sumRange(int i, int j) {
    	return i==0?arr[j]:arr[j]-arr[i-1];
    }
}
