package leetcode_exercise;

public class Lt_922 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {4,2,5,7};
		sortArrayByParityII(nums);
		for (int t : nums) {
			System.out.println(t);
		}
	}
	public static int[] sortArrayByParityII(int[] A) {
		int []j=new int [A.length/2];			//创建奇偶数组存放
		int [] o = new int [A.length/2];
		int j1=0;			
		int o1=0;
		for (int i = 0; i < A.length; i++) {
			if(A[i]%2==0) {
				o[o1++]=A[i];
			}
			else
				j[j1++]=A[i];
		}
		for(int i=0;i<A.length;i+=2) {
			A[i]=o[--o1];
			A[i+1]=j[--j1];
		}
		return A;
    }
}
