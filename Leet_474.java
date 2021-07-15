package leetcode_exercise;

public class Leet_474 {
    public static void main(String[] args) {

    }

    public int findMaxForm(String[] strs, int m, int n) {
        //动态规划
        int len = strs.length;
        int[][][] dp = new int[len + 1][m + 1][n + 1];//方便边界处理
        for (int i = 1; i <= len; i++) {
            int[] ints = countZeroOnes(strs[i - 1]);
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k < n; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (ints[0] <= j && ints[1] <= k) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - ints[0]][k - ints[1]]);
                    }
                }
            }
        }
        return dp[len][m][n];
    }

    public int[] countZeroOnes(String s) {
        int[] zeroOnes = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                zeroOnes[0]++;
            else
                zeroOnes[1]++;
        }
        return zeroOnes;
    }
}
