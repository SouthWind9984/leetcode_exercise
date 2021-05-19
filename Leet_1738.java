package leetcode_exercise;

import java.util.Arrays;

public class Leet_1738 {
    public static void main(String[] args) {

    }

    public int kthLargestValue(int[][] matrix, int k) {
        /*
        二维数组 前缀异或
         */
        int row = matrix.length;
        int col = matrix[0].length;
        int len = row * col;
        int arr[] = new int[len];
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] ^= matrix[i][j - 1];
            }
        }
        int n = 0;
        for (int j = 0; j < col; j++) {
            arr[n++] = matrix[0][j];
            for (int i = 1; i < row; i++) {
                matrix[i][j] ^= matrix[i - 1][j];
                arr[n++] = matrix[i][j];
            }
        }
        //数组排序
        Arrays.sort(arr);
        return arr[len - k];
//        return DP(matrix, k, row, col, len);
    }

    private int DP(int[][] matrix, int k, int row, int col, int len) {
        //动态规划
        int[][] dp = new int[row + 1][col + 1];
        int[] ans = new int[row * col];
        for (int i = 0; i < row + 1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < col + 1; i++) {
            dp[0][i] = 0;
        }
        int m = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                dp[i][j] = dp[i - 1][j - 1] ^ dp[i][j - 1] ^ dp[i - 1][j] ^ matrix[i - 1][j - 1];
                ans[m++] = dp[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[len - k];
    }
}
