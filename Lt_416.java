package LeetCode_ADailyTopic;

public class Lt_416 {

	public static void main(String[] args) {
		int [] nums = {14,9,8,4,3,2,1,21,32,13,12,3,12,3,12,3,12,3,12};
		boolean f =canPartition(nums);
		System.out.println(f);
	}

    public static boolean canPartition(int[] nums) {
		int  sum=0;
		for(int t:nums) {
			sum+=t;
		}
		if(sum%2!=0)
			return false;
		int targer = sum/2;
		int len = nums.length;
        return subset(nums,len-1,targer);
    }
    public static boolean subset(int [] arr , int i , int tager){
		if(tager == 0 ){
			return true;
		}
		else if (i == 0){
			return arr[0]==tager;
		}
		else if (arr[i]>tager){
			return subset(arr,i-1,tager);
		}
		else{
			boolean A = subset(arr,i-1,tager-arr[i]);
			boolean B = subset(arr,i-1,tager);
			return A||B;
		}
	}

}
