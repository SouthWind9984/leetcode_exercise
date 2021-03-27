package leetcode_exercise;

public class Lt_878 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		
	
		System.out.println(Long.MAX_VALUE);
	}
	
	public static int nthMagicalNumber(int n, int a, int b) {
		
		double res = 0;
		int count=0;
		while(count<n) {
			res++;
			if(res%a==0||res%b==0) {
				count++;
			}
		}
		return (int)(res%(10^9 + 7));
	}

}
