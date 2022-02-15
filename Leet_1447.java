package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SouthWind
 * @date 2022/2/10
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1447 {
    public static void main(String[] args) {
        System.out.println(simplifiedFractions(99));
    }

    public static List<String> simplifiedFractions(int n) {
        List<String> ansList = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                //互质为1
                if (gcd(i, j) == 1) {
                    ansList.add(j + "/" + i);
                }
            }
        }
        return ansList;
    }

    //最大公约数，欧几里得
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
