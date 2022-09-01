package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/9/1
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1475 {

    public static void main(String[] args) {

    }

    public int[] finalPrices(int[] prices) {

//        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[i]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
