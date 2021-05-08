package leetcode_exercise;

public class Leet_403 {
    public static void main(String[] args) {

    }

    public boolean canCross(int[] stones) {

        /*
        动态规划
        转移方程：dp[i] = dp[j-1]+dp[j]+dp[j+1]
         */
        int len = stones.length;
        boolean[][] dp = new boolean[len + 1][len + 1];
        dp[1][1] = true;
        for (int i = 2; i < len; i++) {
            for (int j = 1; j < i; j++) {
                int diff = stones[i] - stones[i - 1];
                if (diff <= j + 1) {
                    dp[i][diff] = dp[j][diff - 1] || dp[j][diff] || dp[j][diff + 1];
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if (dp[len - 1][i])
                return true;
        }
        return false;
    }
}
