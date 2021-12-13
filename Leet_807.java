package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/13
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_807 {

    public static void main(String[] args) {

    }

    /**
     * 遍历矩阵，先找出每行，每列的最大值
     * 二次遍历，该行该列的最大值较小之差
     *
     * @param grid
     * @return
     */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] rowMaxArr = new int[row];
        int[] colMaxArr = new int[col];
        // 遍历行，找每一行最大值
        for (int i = 0; i < row; i++) {
            // 遍历列，找每一列的最大值
            for (int j = 0; j < col; j++) {
                int n = grid[i][j];
                rowMaxArr[i] = Math.max(n, rowMaxArr[i]);
                colMaxArr[j] = Math.max(n, colMaxArr[j]);
            }
        }
        int ans = 0;
        //遍历每个位置，可取到的最大值
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans += grid[i][j] - Math.min(colMaxArr[j], rowMaxArr[i]);
            }
        }
        return ans;
    }
}
