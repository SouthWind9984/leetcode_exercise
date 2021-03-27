package leetcode_exercise;

public class Lt_122 {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1 , j = 0 ; i < prices.length; i++) {
            if(prices[i]>prices[j]){
                res += prices[i]-prices[j];
                j=i;
            }
        }
        return res;
    }
}
