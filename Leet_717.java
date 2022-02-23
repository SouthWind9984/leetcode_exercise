package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/20
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_717 {

    public static void main(String[] args) {

    }

    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int i = 0;
        while (i < len - 1) {
            int bit = bits[i];
            if (bit == 1) {
                i += 2;
            } else {
                i += 1;
            }
        }
        return i == len - 1;
    }

}
