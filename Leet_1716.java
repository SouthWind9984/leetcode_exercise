package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/1/15
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1716 {

    public static void main(String[] args) {
        System.out.println(totalMoney(26));
    }

    public static int totalMoney(int n) {
        int ans = 0;
        int week = n / 7;
        int t = 28;
        for (int i = 0; i < week; i++) {
            ans += t;
            t += 7;
        }
        int day = n % 7;
        int tmp = week + 1;
        while (day > 0) {
            ans += tmp;
            tmp++;
            day--;
        }
        return ans;
    }
}
