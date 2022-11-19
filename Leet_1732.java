package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/11/19 9:09
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1732 {

    public static void main(String[] args) {


    }

    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int i : gain) {
            sum += i;
            max = Math.max(sum, max);
        }
        return max;
    }

}
