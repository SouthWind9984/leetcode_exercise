package LeetCode_ADailyTopic;

public class Lt_766 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] matrix = {{65},{66},{67}};

		System.out.println(isToeplitzMatrix(matrix));
	}


    public static boolean isToeplitzMatrix(int[][] matrix) {

        int n =0;
		for (int k = 0; k < matrix.length; k++) {
			for (int i = k,j = 0 ; i < matrix.length&&j<matrix[0].length; j++,i++) {
				n = matrix[k][0];
				if(matrix[i][j]!=n) {
					return false;
				}
			}
		}
		for (int k = 1; k < matrix[0].length; k++) {
			for (int i = 0,j = k ; j < matrix[0].length&&i<matrix.length; j++,i++) {
				n = matrix[0][k];
				if(matrix[i][j]!=n) {
					return false;
				}
			}
		}
		return true;
    }

}
