package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/17
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1518 {

    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int tmp = 0;
        while (numBottles > 0) {
            numBottles += tmp;
            tmp = numBottles % numExchange;
            numBottles /= numExchange;
            ans += numBottles;
        }
        return ans;
    }
}
