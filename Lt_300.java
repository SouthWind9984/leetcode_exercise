package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Lt_300 {
    public static void main(String[] args) {

        int [] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len==1)
            return 1;
        int [] dp = new int[len];
        Arrays.fill(dp,1);
        int res = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j]<nums[i]){
                    dp[i] =  Math.max(dp[j]+1,dp[i]);
                }
            }
            res =Math.max(res,dp[i]);
        }
        return res;
    }


}
/*
2
1
2
2
3
 */
