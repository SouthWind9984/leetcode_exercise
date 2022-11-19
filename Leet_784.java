package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SouthWind
 * @date 2022/10/30 8:36
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_784 {

    public static void main(String[] args) {

    }

    /*
    递归+回溯
     */
    public List<String> letterCasePermutation(String s) {
        char[] chars = s.toCharArray();
        List<String> resList = new ArrayList<>();
        resList.add(s);
        for (int i = 0; i < chars.length; i++) {
            //每一个子集
            for (int j = 0; j <= i; j++) {
                String s1 = new String(chars, 0, j);
                String s2 = new String(chars, j, i + 1 - j);
                String s3 = new String(chars, i + 1, chars.length - i - 1);
                System.out.println(s1 + "--" + s2 + "--" + s3);
                String res = s1 + s2.toUpperCase() + s3;
                if (!resList.contains(res)) {
                    resList.add(res);
                }
            }
        }
        return resList;
    }
}
