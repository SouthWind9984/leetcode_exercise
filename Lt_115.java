package leetcode_exercise;

import java.util.HashMap;

public class Lt_115 {
    public static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";
        numDistinct(s,t);
    }
    public static int numDistinct(String s, String t) {
        int len1 = t.length()+1;
        int len2 = s.length()+1;
        int [][] dp = new int[len1][len2];
        for (int i = 0; i <len2; i++) {
                dp[0][i]=1;
        }
        for (int i = 1; i <=t.length(); i++) {
            for (int j = 1; j <=s.length(); j++) {
                if(t.charAt(i-1)==s.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
                else
                    dp[i][j]=dp[i][j-1];
            }
        }
        System.out.print("\t");
        for (int i = 0; i < len2; i++) {
            if(i==0)System.out.print("*\t");
            else System.out.print(s.charAt(i-1)+"\t");
        }
        System.out.println();
        for (int i = 0; i < dp.length ; i++) {
            if(i==0)System.out.print("*\t");
            else System.out.print(t.charAt(i-1)+"\t");
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+"\t");
            }
        System.out.println();
        }
        return dp[len1-1][len2-1];
    }
}
