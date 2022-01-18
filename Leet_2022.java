package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/1/1
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_2022 {

    public static void main(String[] args) {

    }

    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
        if (m * n != len) return new int[0][];
        int[][] ansArr = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ansArr[i][j] = original[index++];
            }
        }
        return ansArr;
    }
}
