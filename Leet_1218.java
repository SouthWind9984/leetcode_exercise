import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet_1218 {
    public static void main(String[] args) {

    }

    public int longestSubsequence(int[] arr, int difference) {
        int ans = 0;
        int [] dp = new int[40001];
        for (int i = 1; i < arr.length; i++) {
           dp[arr[i]+20000] = dp[arr[i]+20000-difference]+1;
           ans = Math.max(dp[arr[i]+20000],ans);
        }
        return ans;
    }
}
