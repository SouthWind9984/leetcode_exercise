package leetcode_exercise;

public class Lt_566 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		
		int [][] nums = {{1,2,3,4},{5,6,7,8}};
		nums = matrixReshape(nums, 2,4);
		for (int i = 0; i < nums.length; i++) {
			int[] js = nums[i];
			for (int j = 0; j < js.length; j++) {
				int k = js[j];
				System.out.print(k+"   ");
			}
			System.out.println();
		}
	}
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		if(r*c!=nums.length*nums[0].length||r==nums.length&&c==nums[0].length)
			return nums;
		int [][] res = new int [r][c];
		int r1=0;
		int c1=0;
 		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(c1>nums[0].length-1) {
					c1=0;
					r1++;
				}
				res[i][j]=nums[r1][c1++];
			}
 		}
		return res;
 		
	}

}
