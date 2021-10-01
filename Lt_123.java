package LeetCode_ADailyTopic;

public class Lt_123 {
    public static void main(String[] args) {

        int [] arr = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 1){
            return 0;
        }
        int [] dp = new int [len];
        dp[0]=0;
        int min = prices[0];
        int res = 0;
        for(int i = 1 ; i < len ; i++ ){
            if(prices[i]<min){
                min = prices[i];
            }
            dp[i] = Math.max(dp[i-1],prices[i]-min);
            res = Math.max(dp[i],res);
        }
        for (int t :
                dp) {
            System.out.print(t+" ");
        }
        System.out.println();
        return res;
    }
}
