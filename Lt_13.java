package LeetCode_ADailyTopic;

import java.util.HashMap;

public class Lt_13 {
    public static void main(String[] args) {
        String s = "MDCXCV";
        romanToInt(s);
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> lmap = new HashMap<>();
        lmap.put('I',1);lmap.put('V',5);
        lmap.put('X',10);lmap.put('L',50);
        lmap.put('C',100);lmap.put('D',500);
        lmap.put('M',1000);
        char[] chars = s.toCharArray();
        int len = chars.length;
        int res = 0;
        int tmp = 0; //II
        for (int i = 1; i < len; i++) {
            tmp=lmap.get(chars[i-1]);
            if(tmp<lmap.get(chars[i])){
                res+=lmap.get(chars[i])-tmp;
                i++;
            }
            else
                res+=tmp;
        }
        if(tmp>lmap.get(chars[len-1]))
            res+=lmap.get(chars[len-1]);
        System.out.println(res);
        return 0;
    }
}
