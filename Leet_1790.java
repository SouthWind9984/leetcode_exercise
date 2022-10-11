package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/11 9:42
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1790 {

    public static void main(String[] args) {

    }

    public boolean areAlmostEqual(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        char[][] tmp = new char[2][2];
        int count = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (count == 2)
                return false;
            if (chars1[i] != chars2[i]) {
                tmp[count][0] = chars1[i];
                tmp[count++][1] = chars2[i];
            }
        }
        return tmp[0][0] == tmp[1][1] && tmp[0][1] == tmp[1][0];
    }
}
