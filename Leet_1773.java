package LeetCode_ADailyTopic;

import java.util.List;

/**
 * @author SouthWind
 * @date 2022/10/29 8:19
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int index = 0;
        if (!ruleKey.equals("type"))
            index = ruleKey.equals("color") ? 1 : 2;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue))
                ans++;
        }
        return ans;
    }


}
