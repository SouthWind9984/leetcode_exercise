package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/9/24 8:38
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1652 {


    class Solution {
        public int[] decrypt(int[] code, int k) {
            int len = code.length;
            int[] res = new int[len];
            if (k == 0)
                return res;
            if (k > 0)
                for (int i = 0; i < len; i++) {
                    int tmp = 0;
                    int l = i + 1;
                    for (int j = 0; j < k; j++) {
                        if (l == len) l = 0;
                        tmp += code[l++];
                    }
                    res[i] = tmp;
                }
            else {
                for (int i = 0; i < len; i++) {
                    int tmp = 0;
                    int l = i - 1;
                    for (int j = 0; j < Math.abs(k); j++) {
                        if (l == -1) l = len - 1;
                        tmp += code[l--];
                    }
                    res[i] = tmp;
                }
            }
            return res;
        }
    }
}
