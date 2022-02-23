package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/23
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_917 {

    public static void main(String[] args) {
//        for (int i = 33; i <= 122; i++) {
//            System.out.print(i+":"+(char)i+"\t");
//        }
//        System.out.println((char)0);

        //65-90 97 - 122
        reverseOnlyLetters("Test1ng-Leet=code-Q!");
    }

    public static String reverseOnlyLetters(String s) {
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = new char[101];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                stringBuilder.append(c);
            } else {
                chars[i] = c;
            }
        }
        stringBuilder.reverse();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if ((int) aChar > 0) {
                stringBuilder.insert(i, aChar);
            }
        }
//        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

}
