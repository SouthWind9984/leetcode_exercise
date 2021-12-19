package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/18
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_419 {
    public static void main(String[] args) {

    }

    public int countBattleships(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char c = board[i][j];
                if (c == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
