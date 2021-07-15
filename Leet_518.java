package leetcode_exercise;

public class Leet_518 {
    public static void main(String[] args) {

    }

    public int change(int amount, int[] coins) {
        int len = coins.length;
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = 0; j + coin <= amount; j++) {
                dp[j + coin] += dp[j];
            }
        }
        return dp[amount];
    }

}
