package LeetCode_ADailyTopic;


public class Leet_1446 {

    public static void main(String[] args) {

    }

    public int maxPower(String s) {
        int maxLen = 0;
        if (s.length() == 1) return 1;
        int len = s.length();
        int left = 0;
        int right = 1;
        while (right < len) {
            while (right < len && s.charAt(left) == s.charAt(right)) {
                right++;
            }
            int tmpLen = right - left;
            maxLen = Math.max(maxLen, tmpLen);
            left = right;
        }
        return maxLen;
    }

}
