package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/11/8 10:47
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1684 {

    public static void main(String[] args) {

    }

    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for (String word : words) {
            String s = word.replaceAll("[" + allowed + "]", "");
            if (s.length() == 0)
                res++;
        }
        return res;
    }
}
