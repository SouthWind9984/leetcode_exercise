package LeetCode_ADailyTopic;

public class Lt_213 {
    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        int len = nums.length;
        if(len ==  0 )
            return 0;
        if (len == 1 ){
            return nums[0];
        }
        //0 - n-1
        int [] dp1 = new int[len-1];
        dp1[0]=nums[0];
        dp1[1]=nums[1]>nums[0]?nums[1]:nums[0];
        for(int i = 2 ; i < len - 1 ; i++ ){
            int A = dp1[i-2]+nums[i];
            int B = dp1[i-1];
            dp1[i] = Math.max(A,B);
        }
        //1 - n
        int [] dp2 = new int[len-1];
        dp2[0]=nums[1];
        dp2[1]=nums[2]>nums[1]?nums[2]:nums[1];
        for (int i = 3; i < len; i++) {
            int A = dp1[i-2]+nums[i];
            int B = dp1[i-1];
            dp2[i-1]=Math.max(A,B);
        }
        return Math.max(dp1[len-2],dp2[len-2]);
    }
}
