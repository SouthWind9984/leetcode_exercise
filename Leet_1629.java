package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/1/9
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1629 {

    public static void main(String[] args) {

    }

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] chars = keysPressed.toCharArray();
        char ans = chars[0];
        int time = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            char aChar = chars[i];
            int tmp = releaseTimes[i] - releaseTimes[i - 1];
            if (tmp > time) {
                time = tmp;
                ans = aChar;
            } else if (tmp == time && aChar > ans) {
                ans = aChar;
            }
        }
        return ans;
    }
}
