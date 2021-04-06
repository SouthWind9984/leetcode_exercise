package leetcode_exercise;

public class Lt_74 {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            if (matrix[i][col-1]>=target){
                for (int j = 0; j < col; j++) {
                    if(matrix[i][j]==target)
                        return true;
                }
            }
        }
        return false;
    }
}
