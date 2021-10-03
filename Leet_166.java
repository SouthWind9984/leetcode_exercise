package LeetCode_ADailyTopic;


import java.util.HashMap;
import java.util.Map;

public class Leet_166 {

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4, 333));

    }

    public static String fractionToDecimal(int numerator, int denominator) {
        long num = numerator, den = denominator;
        if (num % den == 0) return String.valueOf(num / den);
        StringBuilder sb = new StringBuilder();
        if (num * den < 0) {
            sb.append('-');
        }
        num = Math.abs(num);
        den = Math.abs(den);
        long pre = num / den;
        sb.append(pre).append('.');
        num = num - (num / den) * den;
        Map<Long, Integer> map = new HashMap<>();
        while (num != 0) {
            map.put(num, sb.length());
            num *= 10;
            sb.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                int index = map.get(num);
                return sb.substring(0, index) + "(" + sb.substring(index) + ")";
            }
        }
        return sb.toString();
    }
}
