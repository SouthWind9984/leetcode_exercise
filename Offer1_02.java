package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/9/27 8:14
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Offer1_02 {
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            if (s1.length() != s2.length())
                return false;
            char[] chars = s1.toCharArray();
            char[] chars1 = s2.toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chars1);
//            System.out.println(Arrays.toString(chars) +" "+ Arrays.toString(chars1));
            return Arrays.equals(chars, chars1);
        }
    }

}
