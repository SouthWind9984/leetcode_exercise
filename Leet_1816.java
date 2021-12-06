package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/6
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1816 {
    public static void main(String[] args) {

    }

    public String truncateSentence(String s, int k) {
        int index = 0;
        int count = 0;
        while (count < k) {
            index = s.indexOf(" ", index + 1);
            if (index == -1)
                return s;
            count++;
        }
        String substring = s.substring(0, index);
        return substring;
    }
}
