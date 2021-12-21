package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/20
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_475 {
    public static void main(String[] args) {

    }

    public int findRadius(int[] houses, int[] heaters) {
        int ans = -1;
        for (int house : houses) {
            int tmp = Integer.MAX_VALUE;
            for (int heater : heaters) {
                int n = Math.abs(heater - house);
                tmp = Math.min(tmp, n);
            }
            ans = Math.max(tmp, ans);
        }
        return ans;
    }
}
