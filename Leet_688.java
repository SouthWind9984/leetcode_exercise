package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/17
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_688 {

    /**
     * @param n      行列
     * @param k      次数
     * @param row    x坐标
     * @param column y坐标
     * @return
     */
    public double knightProbability(int n, int k, int row, int column) {
        if (k == 0) return 1;
        //上下左右 进行移动
        //上 -- ( x + 1,y - 2) ( x - 1, y - 2)
        //下 -- ( x + 1,y + 2) ( x - 1, y + 2)
        //左 -- ( x - 2,y + 1) ( x - 2, y - 1)
        //右 -- ( x - 2,y + 1) ( x - 2, y - 1)

        double[][][] matrix = new double[n][n][k + 1];
        return dfs(n, k, row, column, matrix);
    }

    private final int[][] dirs = {
            {1, 2}, {2, 1},
            {-1, 2}, {2, -1},
            {1, -2}, {-2, 1},
            {-1, -2}, {-2, -1}
    };

    public double dfs(int n, int k, int r, int c, double[][][] matrix) {
        if (r < 0 || c < 0 || r >= n || c >= n) {
            return 0;
        }
        if (k == 0) {
            return 1;
        }
        if (matrix[r][c][k] != 0)
            return matrix[r][c][k];
        double ans = 0;
        for (int[] dir : dirs) {
            ans += dfs(n, k - 1, r + dir[0], c + dir[1], matrix) / 8.0;
        }
        matrix[r][c][k] = ans;
        return ans;
    }
}
