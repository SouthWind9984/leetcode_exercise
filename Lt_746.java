package leetcode_exercise;

public class Lt_746 {
    public static void main(String[] args) {
        int [] nums = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(nums));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int res = 0;
        int len = cost.length;
        int [] dp = new int[len];
        for (int i = len-1; i >=1 ;i--) {
            //选与不选
        }
        System.out.println(res);
        return 0;
    }
    public int dp(int[] cost , int n){
        int len = cost.length;
        for (int i = 0; i < len; i++) {
            if(cost[i]>cost[i-1])
                dp(cost,i-1);
            else
                dp(cost,i);
        }
        return cost[n];
    }
}
