package leetcode_exercise;

public class Offer29 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] nums = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int arr [] = new int [nums.length*nums[0].length];
		arr= spiralOrder(nums);
		for (int i : arr) {
			System.out.print(i+"  ");
			
			
//			for(int i=0,j=0;i*j<max_c*max_r;) {
//				
//				
//				if(j==max_c) {
//					i++;
//				}
//				res[n++]=matrix[i][j];
//				if(i==0) {
//					j++;
//				}
//				
//			}
//			for(int i=max_r,j=max_c-1;i+j>0;) {
//				res[n++]=matrix[i][j];
//				if(j==0) {
//					i--;
//				}
//				if(i==max_r) {
//					j--;
//				}
//			}
		}
		System.out.println();
		for (int j = 1; j <=25; j++) {
			
			System.out.print(j+"\t");
			if(j%5==0)
				System.out.println();
		}
	}
	public static int[] spiralOrder(int[][] matrix) {
		
		int [] res = new int [matrix.length*matrix[0].length];
		int n = 0;
		int max_r = matrix.length-1;
		int max_c = matrix[0].length-1;
		int r=0;//行	
		int c=0;//列
		int m=0;
		while(n<res.length) {
			//向右
				
				while(c<max_c) {
					res[n++]=matrix[r][c++];
				}
			//向下
				
				do{
					res[n++]=matrix[r++][c];
				}while(r<max_r);
			//向左
				
				while(c>m){
					res[n++]=matrix[r][c--];
				}
			//向上
				while(r>m+1) {
					res[n++]=matrix[r--][c];
				}
				max_r--;
				max_c--;
				m++;
		}
		
		return res;

    }

}
