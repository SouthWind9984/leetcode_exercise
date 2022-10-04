package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/1 8:12
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1694 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reformatNumber("1235453"));
    }

    static class Solution {
        /*
        三个一组
         */
        public String reformatNumber(String number) {
            String s = number.replaceAll("\\D", "");
            int len = s.length();
            char[] chars = s.toCharArray();
            StringBuilder res = new StringBuilder();
            // if 最后余1 == 4， 2 -- 2
            int index = 0;
            //留下少于四个字符
            while (index < len - 4) {
                StringBuilder tmp = new StringBuilder();
                for (int j = 0; j < 3; j++) {
                    tmp.append(chars[index++]);
                }
                if (res.length() > 1) {
                    res.append('-').append(tmp);
                } else {
                    res.append(tmp);
                }
            }
            //处理4个字符
            if (len - index == 4) {
                for (int j = 0; j < 2; j++) {
                    StringBuilder tmp = new StringBuilder();
                    for (int k = 0; k < 2; k++) {
                        tmp.append(chars[index++]);
                    }
                    if (res.length() > 1) {
                        res.append('-').append(tmp);
                    } else {
                        res.append(tmp);
                    }
                }
            } else {
                String tmp = s.substring(index, len);
                if (res.length() > 1) {
                    res.append('-').append(tmp);
                } else {
                    res.append(tmp);
                }
            }
            return res.toString();
        }
    }
}
