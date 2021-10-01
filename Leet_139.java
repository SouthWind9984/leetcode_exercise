package LeetCode_ADailyTopic;

import java.util.List;

public class Leet_139 {
    public static void main(String[] args) {

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for (String str :wordDict) {
            s=s.replaceAll(str, "");
            System.out.println("s = " + s);
        }
        return s.equals("");
    }
}
