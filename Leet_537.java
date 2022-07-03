package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/25
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_537 {

    public static void main(String[] args) {
        complexNumberMultiply("1+1i", "1+1i");
    }

    /**
     * 复数乘法：z1(a + bi) x z2(c + di) =(ac - bd) + (bc + ad)i
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String complexNumberMultiply(String num1, String num2) {
        String[] split1 = num1.replace("i", "").split("\\+");
        String[] split2 = num2.replace("i", "").split("\\+");
        int a = Integer.parseInt(split1[0]) * Integer.parseInt(split2[0]) - Integer.parseInt(split1[1]) * Integer.parseInt(split2[1]);
        int b = Integer.parseInt(split1[1]) * Integer.parseInt(split2[0]) + Integer.parseInt(split1[0]) * Integer.parseInt(split2[1]);
        return a + "+" + b + "i";
    }
}
