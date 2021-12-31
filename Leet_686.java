package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/22
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_686 {

    public static void main(String[] args) {

    }

    public int repeatedStringMatch(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        StringBuilder strBuilder = new StringBuilder();
        int count = 2 * len1 + len2;
        if (a.contains(b))
            return 1;
        for (int i = 1; i <= count; i++) {
            strBuilder.append(a);
            if (strBuilder.indexOf(b) != -1)
                return i;
        }
        return -1;
    }
}
