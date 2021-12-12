package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/9
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_794 {
    public static void main(String[] args) {

    }

    /**
     * X 比 O 先手，初始牌面 X - O <= 1,
     * X 赢的时候 比 O 多一个
     * O 赢与 X 相等
     * X、O 不能同时赢
     *
     * @param board
     * @return
     */
    public boolean validTicTacToe(String[] board) {
        int countX = 0;
        int countO = 0;
        int len = board.length;
        for (String s : board) {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'O') {
                    countO++;
                } else if (c == 'X') {
                    countX++;
                }
            }
        }
        if (countX < countO || countX - countO > 1) return false;
        boolean winX = false;
        boolean winO = false;
        for (String s : board) {
            if (s.equals("XXX")) winX = true;
            if (s.equals("OOO")) winO = true;
        }
        for (int i = 0; i < 3; i++) {
            if (board[0].charAt(i) == 'X' && board[1].charAt(i) == 'X' && board[2].charAt(i) == 'X') winX = true;
            if (board[0].charAt(i) == 'O' && board[1].charAt(i) == 'O' && board[2].charAt(i) == 'O') winO = true;
        }
        if (board[0].charAt(0) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(2) == 'X') winX = true;
        if (board[0].charAt(2) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(0) == 'X') winX = true;
        if (board[0].charAt(0) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(2) == 'O') winO = true;
        if (board[0].charAt(2) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(0) == 'O') winO = true;
        if (winO && winX) return false;
        if (winX && countX - countO != 1) return false;
        if (winO && countX != countO) return false;
        return true;
    }

}
