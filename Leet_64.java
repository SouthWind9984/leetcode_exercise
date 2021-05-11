package leetcode_exercise;

public class Leet_64 {
    public static void main(String[] args) {

    }

    /*
    逆走，找前一步的最短路径
     */
    public int minPathSum(int[][] grid) {
        int len = grid.length;
        int col = grid[0].length;
        for (int i = 1; i < len; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < col; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < col; j++) {
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[len - 1][col - 1];
    }
}
