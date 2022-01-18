package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/1/2
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_390 {
    public static void main(String[] args) {
        int n = 9;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (n / 2 + 1 - lastRemaining(n / 2));
    }
}
