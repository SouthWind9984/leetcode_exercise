package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/5
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1219 {

    public static void main(String[] args) {

    }

    int m, n;
    int ans = 0;
    int[][] grid;
    int[][] location = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int getMaximumGold(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                int gold = grid[i][j];
                if (gold > 0) {
                    dfs(i, j, 0);
                }
            }
        }
        return ans;
    }

    /**
     * DFS 深度搜索
     *
     * @param x
     * @param y
     * @param gold
     */
    public void dfs(int x, int y, int gold) {
        gold += grid[x][y];
        ans = Math.max(ans, gold);
        //将当前的格子设置为0，防止开采两次
        int tmp = grid[x][y];
        grid[x][y] = 0;
        //遍历周围的所有方向
        for (int i = 0; i < 4; i++) {
            int x1 = x + location[i][0];
            int y1 = y + location[i][1];
            if (x1 >= 0 && x1 < m && y1 >= 0 && y1 < n && grid[x1][y1] > 0) {
                //符合条件开始进行回溯
                dfs(x1, y1, gold);
            }
        }
        //回溯完，然后恢复之前的值
        grid[x][y] = tmp;
    }
}
