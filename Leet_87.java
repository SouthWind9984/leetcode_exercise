package LeetCode_ADailyTopic;

import java.util.HashMap;

public class Leet_87 {
    public static void main(String[] args) {
        String s1 = "great";
        String s2 = "rgeat";
        isScramble(s1,s2);
    }

    public static boolean isScramble(String s1, String s2) {
        int len = s1.length();
        if(len==1){
            return s1.equals(s2);
        }
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 1; i < len; i++) {
            String str1 = s1.substring(0,i);
            String str2 = s1.substring(i);
            s1 = str1+str2;
            System.out.println(str1+"   "+str2);
        }
        return false;
    }
}

