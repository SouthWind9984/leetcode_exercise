package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/12
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_709 {

    public static void main(String[] args) {
        String str = "HelloWorld";
        String s = toLowerCase(str);
        System.out.println(s);
    }

    /*
    72
    0100 1000
    32
    0010 0000
    0110 1000
     */
    public static String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        StringBuilder sBuilder = new StringBuilder();
        for (char c : chars) {
            if (c >= 'A' && c <= 'Z')
                c |= 32;
            sBuilder.append(c);
        }
        return sBuilder.toString();
    }
}
