package leetcode_exercise;

public class Lt_304 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}

class NumMatrix {

	private int [][] arr;
    public NumMatrix(int[][] matrix) {

    	if(matrix.length==0)
    		return;
    	arr = new int [matrix.length][matrix[0].length+1];
		for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[0].length; j++) {
    			arr[i][j+1] = arr[i][j]+matrix[i][j];
			}
    	}
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
		int sum = 0; 
    	for (int i = row1; i <= row2; i++) {
    		sum+=arr[i][col2]-arr[i][col1-1];
		}
    	return sum;
    }
}
