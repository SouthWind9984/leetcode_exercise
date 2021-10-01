package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Lt_132 {
    public static void main(String[] args) {
        String s = "eegiicgaeadbcfacfhifdbiehbgejcaeggcgbahfcajfhjjdgj";
        System.out.println(minCut(s));
    }
    public static int minCut(String s) {
        int len = s.length();
        int max = -1;
        int max_start = 0;
        int max_end = 0;
        boolean [][] par = new boolean[len][len];
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                String str = s.substring(j,i);
                boolean bol = isPartitioning(str);
                par[j][i-1]=bol;
                if(bol){
                    int tmp = Math.abs(j-i-1);
                    if(tmp>max){
                        max=tmp;
                        max_start = j;
                        max_end = i-1;
                    }
                }
//                System.out.println(str+"  "+isPartitioning(str));
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print("\t"+i+"\t");
        }
        System.out.println();

        for (int i = 0; i < len; i++) {
            System.out.print(i+"\t");
            for (int j = 0; j < len; j++) {
                System.out.print(par[i][j]+"\t");
            }
            System.out.println();
        }


        System.out.println("max:"+max_start+"  "+max_end);
        int res = 0 ;
        int tmp = 0;
        for (int i = 0; i < max_start-1 ; i++) {     //行    头
            boolean bol = false;
            for (int j = i; j < len; j++) {     //列   尾
                if(par[i][j]){
                    tmp=j;
                    System.out.println("if: "+i+" "+j);
                    bol = true;
                }
            }
            if (bol){
                i = tmp;
                res++;
            }
        }
        System.out.println("res:"+res);
        for (int i = max_end+1; i < len ; i++) {  //行    头
            boolean bol = false;
            for (int j = i; j < len; j++) {     //列   尾
                if(par[i][j]){
                    tmp=j;
                    System.out.println("if: "+i+" "+j);
                    bol = true;
                }
            }
            if(bol){
                if (tmp==len-1)
                    return res;
                i = tmp;
                res++;
            }
        }

        return res;
    }

    public static boolean isPartitioning(String str) {
        int len = str.length();
        for (int i = 0; i < len /2 ; i++) {
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    //answer
    public int mincut(String s) {
        if(s == null || s.length() <= 1)
            return 0;
        int len = s.length();
        int dp[] = new int[len];
        Arrays.fill(dp, len-1);
        for(int i = 0; i < len; i++){
            // 注意偶数长度与奇数长度回文串的特点
            mincutHelper(s , i , i , dp);  // 奇数回文串以1个字符为中心
            mincutHelper(s, i , i+1 , dp); // 偶数回文串以2个字符为中心
        }
        return dp[len-1];
    }
    private void mincutHelper(String s, int i, int j, int[] dp){
        int len = s.length();
        while(i >= 0 && j < len && s.charAt(i) == s.charAt(j)){
            dp[j] = Math.min(dp[j] , (i==0?-1:dp[i-1])+1);
            i--;
            j++;
        }
    }
}
