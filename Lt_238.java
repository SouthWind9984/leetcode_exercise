package leetcode_exercise;

public class Lt_238 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {2,2,2,2};
		productExceptSelf(arr);
	}
	
	public static int[] productExceptSelf(int[] nums) {
		
		int [] answer = new int [nums.length];
		int n = 1;
        for(int i = 0 ; i < answer.length ; i++){
        	answer[i] = n; 
        	n *= nums[i]; 
        }
        for (int i = 0; i < answer.length; i++) {
			int j = answer[i];
			System.out.print(j+"  ");
		}
        System.out.println();
        n=1;
        for (int i = answer.length - 1 ; i >= 0 ; i--) {
        	answer[i]*=n;
        	n *= nums[i];
		}
        for (int i = 0; i < answer.length; i++) {
			int j = answer[i];
			System.out.print(j+"  ");
		}
        return answer;
		
	}
}
