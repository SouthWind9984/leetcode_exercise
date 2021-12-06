package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/5
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_372 {

    public static void main(String[] args) {
        int a = 2147483647;
        int[] b = {2, 0, 0};
        System.out.println(superPow(a, b));
    }

    /**
     * 中间值用long 来接收，以防整数溢出
     *
     * @param a
     * @param b
     * @return
     */
    public static int superPow(int a, int[] b) {
        long ans = 1;
        int mo = 1337;
        for (int i : b) {
            long tmp = 1;
            for (int j = 0; j < 10; j++) {
                tmp *= ans;
                tmp %= mo;
            }
            ans = tmp;
            tmp = 1;
            for (int j = 0; j < i; j++) {
                tmp *= a;
                tmp %= mo;
            }
            ans *= tmp;
            ans %= mo;
        }
        return (int) ans;
    }
}
