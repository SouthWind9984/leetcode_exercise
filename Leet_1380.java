package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SouthWind
 * @date 2022/2/15
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1380 {
    public static void main(String[] args) {

    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        //存储行
        int[] row = new int[m];
        //存储列
        int[] col = new int[n];
        for (int i = 0; i < m; i++) {
            row[i] = matrix[i][0];
            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];
                row[i] = Math.min(row[i], num);
                col[j] = Math.max(col[j], num);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];
                if (num == row[i] && num == col[j]) {
                    list.add(num);
                    break;
                }
            }
        }
        return list;
    }
}
