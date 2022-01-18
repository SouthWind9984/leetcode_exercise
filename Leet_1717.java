package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/1/6
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1717 {
    public static void main(String[] args) {
        String s = "ababcdbcbbaa";
        int index = -1;
        int count = 0;
        int x = 4;
        int y = 5;
        System.out.println(maximumGain(s, x, y));
    }

    public static int maximumGain(String s, int x, int y) {
        int ans = 0;
        if (x > y) {
            int index;
            int count = 0;
            while ((index = s.indexOf("ab")) != -1) {
                s = s.substring(0, index) + s.substring(index + 2);
                count++;
            }
            ans += count * x;
            count = 0;
            while ((index = s.indexOf("ba")) != -1) {
                s = s.substring(0, index) + s.substring(index + 2);
                count++;
            }
            ans += count * y;
        } else {
            int index;
            int count = 0;
            while ((index = s.indexOf("ba")) != -1) {
                s = s.substring(0, index) + s.substring(index + 2);
                count++;
            }
            ans += count * y;
            count = 0;
            while ((index = s.indexOf("ab")) != -1) {
                s = s.substring(0, index) + s.substring(index + 2);
                count++;
            }
            ans += count * x;
        }
        return ans;
    }
}
