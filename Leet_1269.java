package leetcode_exercise;

import java.util.Arrays;

public class Leet_1269 {
    public static void main(String[] args) {

    }

    public int numWays(int steps, int arrLen) {
        int mod = 100000007;
        int col = Math.min(steps, arrLen - 1);
        int[][] dp = new int[steps + 1][col + 1];//操作数  所在下标
        dp[0][0] = 1;
        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j <= col; j++) {
                if (j - 1 >= 0)
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % mod;
                if (j + 1 <= col)
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j + 1]) % mod;
            }
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        return dp[steps][0];
    }

}
