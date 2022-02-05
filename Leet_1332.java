package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/1/22
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1332 {

    public int removePalindromeSub(String s) {
        return new StringBuilder(s).reverse().toString().equals(s) ? 1 : 2;
    }

}
