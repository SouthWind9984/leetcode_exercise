package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/12
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1020 {

    public static void main(String[] args) {

    }

    boolean[][] matrix;
    int n, m;
    int[][] grid1;

    public int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        grid1 = grid;
        matrix = new boolean[n][m];
        //遍历最外一圈可到达的坐标
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) matrix[i][0] = true;
            if (grid[i][n - 1] == 1) matrix[i][n - 1] = true;
        }
        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1) matrix[0][i] = true;
            if (grid[m - 1][i] == 1) matrix[m - 1][i] = true;
        }
        int ans = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int num = grid[i][j];
                if (num == 0) continue;
                if (matrix[i][j] || dfs(i, j)) {
                    matrix[i][j] = true;
                } else {
                    ans++;
                }
            }
        }
        return ans;
    }

    int[][] location = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public boolean dfs(int x, int y) {
        if (x == 0 || y == 0 || x == m - 1 || y == n - 1)
            return matrix[x][y];
        //遍历四个方向
        for (int i = 0; i < 4; i++) {
            int x1 = x + location[i][0];
            int y1 = y + location[i][1];
            if (matrix[x1][y1]) return true;
            if (x1 > 0 && x1 < m && y1 > 0 && y1 < n && grid1[x1][y1] != 0) {
                matrix[x1][y1] = dfs(x1, y1);
            }
        }
        return false;
    }


}
