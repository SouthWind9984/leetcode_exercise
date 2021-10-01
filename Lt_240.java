package LeetCode_ADailyTopic;

public class Lt_240 {
    public static void main(String[] args) {
        int [][] matrix = {{-1,3}};
        System.out.println(searchMatrix(matrix,-1));
    }
    /*
    [1,3,5,7,9],
    [2,4,6,8,10],
    [11,13,15,17,19],
    [12,14,16,18,20],
    [21,22,23,24,25]
    5
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;
        //从左下角，依次向
         while(row>=0&&col<matrix[0].length){
            if(target==matrix[row][col]){
                return true;
            }
            if(target>matrix[row][col]){
                col++;
            }
            else
                row--;
        }
        return false;
    }
}
