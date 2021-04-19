package leetcode_exercise;

public class Leet_647 {
    public static void main(String[] args) {
        countSubstrings("aaa");
    }
    public static int countSubstrings(String s) {

        int len = s.length();
        int res = len;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i-1; j++) {
                String str = s.substring(j,i);
//                System.out.println(str);
                if(Palindromic(str))
                    res++;
            }
        }
        System.out.println(res);
        return res;
    }
    public static boolean Palindromic(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
