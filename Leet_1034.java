package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2021/12/7
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1034 {
    /*
    [
    [1,1,1],
    [1,1,1],
    [1,1,1]
    ]
1
1
2
     */
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 1},
                {1, 1, 2},
                {1, 2, 1},
                {1, 1, 1},
                {1, 2, 1},
        };
        Leet_1034 leet_1034 = new Leet_1034();
        int[][] ints = leet_1034.colorBorder(grid, 1, 1, 3);
        for (int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }
    }

    /**
     * 找寻指定坐标周围相同的点,遍历四方联通
     * 当前坐标四周找
     *
     * @param grid
     * @param row
     * @param col
     * @param color
     * @return
     */
    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    boolean[][] matrix;
    int m, n;

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        m = grid.length;
        n = grid[0].length;
        matrix = new boolean[m][n];
        matrix[row][col] = true;
        dfs(grid, row, col);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                只染边界
                if (matrix[i][j]) {
                    if (i == 0 || j == 0 || i == m - 1 || j == n - 1)
                        grid[i][j] = color;
                    else if (!matrix[i - 1][j] || !matrix[i + 1][j] || !matrix[i][j - 1] || !matrix[i][j + 1]) {
                        grid[i][j] = color;
                    }
                }
            }
        }
        return grid;
    }


    /**
     * DFS 遍历矩阵
     *
     * @param grid
     * @param row
     * @param col
     */
    public void dfs(int[][] grid, int row, int col) {
        int num = grid[row][col];
        for (int[] dir : dirs) {
            int row1 = row + dir[0];
            int col1 = col + dir[1];
            if (row1 >= m || row1 < 0 || col1 < 0 || col1 >= n) continue;
            if (grid[row1][col1] == num && !matrix[row1][col1]) {
                matrix[row1][col1] = true;
                dfs(grid, row1, col1);
            }
        }
    }
}
