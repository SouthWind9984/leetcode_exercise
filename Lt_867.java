package leetcode_exercise;

public class Lt_867 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public static int[][] transpose(int[][] matrix) {
		
		int len = matrix.length;
		int col = matrix[0].length;
		if(len%2==0||col%2==0||len==1||col==1) {
			int	[][] res = new int [col][len];
			for(int i = 0 ; i<col;i++) {
				for (int j = 0; j < len; j++) {
					res[i][j]=matrix[j][i];
				}
			}
			return res;
		}
		else {
			for(int i = 1 ; i<len;i++) {
				for (int j = 0; j < i; j++) {
					int tmp = matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=tmp;
				}
			}
		}
		return matrix;
    }

}
