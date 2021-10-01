package LeetCode_ADailyTopic;

public class Lt_198 {
    public static void main(String[] args) {
        int [] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int len = nums.length;
        if(len==0)
            return 0;
        int [] dp = new int[len];
        dp[0] = nums[0];
        if(len == 1)
            return dp[0];
        dp[1] = Math.max(nums[1],dp[0]);
        for (int i = 2; i < len ; i++ ) {
            int A = dp[i-2]+nums[i];
            int B = dp[i-1];
            dp[i] = Math.max(A,B);
        }
        return dp[len-1];
    }
}
