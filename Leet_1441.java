package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SouthWind
 * @date 2022/10/15 8:58
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1441 {

    public static void main(String[] args) {

    }

    public List<String> buildArray(int[] target, int n) {
        List<String> ansList = new ArrayList<>();
        String[] operate = {"Push", "Pop"};
        for (int i = 1, j = 0; i <= n && j < target.length; i++) {
            //如果数组中存在加入
            int k = target[j];
            ansList.add(operate[0]);
            if (k == i) {
                j++;
            } else {
                ansList.add(operate[1]);
            }
        }
        return ansList;
    }
}
