package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/7/12
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1252 {
    public static void main(String[] args) {

    }

    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int[] index : indices) {
            rows[index[0]]++;
            if (rows[index[0]] % 2 == 0) rows[index[0]] = 0;
            cols[index[1]]++;
            if (cols[index[1]] % 2 == 0) cols[index[1]] = 0;
        }
        int ans = 0;
        for (int row : rows) {
            ans = (row * n) + ans;
        }
        for (int col : cols) {
            ans = ans - (col * m);
        }
        return ans;
    }
}
