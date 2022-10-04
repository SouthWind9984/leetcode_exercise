package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/2 8:49
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_777 {


    public static void main(String[] args) {

    }


    class Solution {
        /*
        LX 来替换原有的 XL, L向右移
        RX 替换原有的 XR, R向左移动
         */
        public boolean canTransform(String start, String end) {


            char[] chars1 = start.toCharArray();
            char[] chars2 = end.toCharArray();
            int len = start.length();
            int l = 1; // L
            int r = 0; // R
            while (true) {
                while (l < len && chars1[l] == 'X') {
                    l++;
                }
                while (r < len && chars2[r] == 'X') {
                    r++;
                }
                if (l == len && r == len)
                    return true;
                if (l == len || r == len || chars1[l] != chars2[r])
                    return false;
                if (chars1[l] == 'L' && l < r || chars2[r] == 'R' && l > r)
                    return false;
                l++;
                r++;
            }
        }
    }
}
