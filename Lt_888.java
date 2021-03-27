package leetcode_exercise;

public class Lt_888 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int	[] A = {1,2,5};
		int [] B = {2,4};
		fairCandySwap(A, B);
	}
	public static int[]  fairCandySwap(int[] A, int[] B) {
		int [] res = new int [2];
		
		int sum=0;
		int A_sum=0;
		int B_sum=0;
		for (int i = 0; i < A.length; i++) {
			int j = A[i];
			A_sum+=j;
		}
		for (int i = 0; i < B.length; i++) {
			int j = B[i];
			B_sum+=j;
		}
		sum=A_sum+B_sum;
		int ave = sum/2;
		int differ = A_sum>B_sum?A_sum-B_sum:B_sum-A_sum;
		if(A_sum>ave) {
			for (int i = 0; i < A.length; i++) {
				int a = A[i];
				for (int j = 0; j< B.length; j++) {
					int b = B[j];
					if(a-b==differ) {
						res[0]=a;
						res[1]=b;
					}
				}
			}
		}
		else {
			for (int i = 0; i < A.length; i++) {
				int a = A[i];
				for (int j = 0; j< B.length; j++) {
					int b = B[j];
					if(b-a==differ) {
						res[0]=a;
						res[1]=b;
					}
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			int j = res[i];
			System.out.println(j);
		}
		return res;
    }

}
