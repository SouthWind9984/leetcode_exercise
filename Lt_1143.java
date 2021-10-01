package LeetCode_ADailyTopic;

public class Lt_1143 {
    public static void main(String[] args) {
        String text1 = "mhunuzqrkzsnidwbun";
        String text2 = "szulspmhwpazoxijwbq";
        System.out.println(longestCommonSubsequence(text1,text2));

    }
    /*
    m h z i w b
    ""
     */
    public static int longestCommonSubsequence(String text1, String text2) {
         int len1 = text1.length();
         int len2 = text2.length();
         int [][] dp = new int [len1+1][len2+1];  //1---行  2---列
        //第一列全为0
        for (int i = 0; i < len1; i++) {
            dp[i][0]=0;
        }
        //第一行全为0
        for (int i = 0; i < len2; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i < len1+1; i++) {
            for (int j = 1; j < len2+1; j++) {
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[len1][len2];
    }
}
