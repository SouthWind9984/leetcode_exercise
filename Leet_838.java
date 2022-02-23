package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/21
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_838 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.pushDominoes(".L.R...LR..L.."));
    }


    static class Solution {

        public String pushDominoes(String dominoes) {
            dominoes = "L" + dominoes + "R";
            char[] chars = dominoes.toCharArray();
            int len = chars.length;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i < len - 1; i++) {
                if (chars[i] == '.') {
                    //双指针
                    int l = i - 1, r = i + 1;
                    while (l > 0) {
                        if (chars[l] == 'R' || chars[l] == 'L') {
                            break;
                        }
                        l--;
                    }
                    while (r < len - 1) {
                        if (chars[r] == 'L' || chars[r] == 'R') {
                            break;
                        }
                        r++;
                    }
                    double mid = (l + r) / 2.0;
                    if (chars[l] == 'R' || chars[r] == 'L') {
                        if (i == 1) {
                            chars[i] = 'L';
                        } else if (i == mid)
                            chars[i] = '.';
                        else if (i < mid) {
                            chars[i] = 'R';
                        } else {
                            chars[i] = 'L';
                        }
                    }
                }
                stringBuilder.append(chars[i]);
            }
            return stringBuilder.toString();
        }
    }
}
