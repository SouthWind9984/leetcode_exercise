package leetcode_exercise;

public class Lt_5 {
    public static void main(String[] args) {
        String s = "bacabd";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        boolean [][] dp = new boolean[len][len];
        int start = 0;
        int end = 0;
        for (int i = 0; i <=len; i++) {
            for (int j = 0; j < i; j++) {
                if(isPalindromic(s.substring(j,i))){
                    if(end-start<i-j){
                        start=j;
                        end=i;
                    }
                }
            }
        }
        return s.substring(start,end);
    }
    public static boolean isPalindromic(String str){
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if(str.charAt(i)!=str.charAt(len-i-1))
                return false;
        }
        return true;
    }
}
