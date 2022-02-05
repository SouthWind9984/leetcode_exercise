package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/2
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_2000 {

    public static void main(String[] args) {

    }

    public String reversePrefix(String word, char ch) {
        return word.indexOf(ch) == -1 ? new StringBuilder(word.substring(0, word.indexOf(ch) + 1)).reverse() + word.substring(word.indexOf(ch) + 1) : word;
    }
}
