package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SouthWind
 * @date 2022/10/12 23:02
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_817 {
    public int numComponents(ListNode head, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        //确定连接组件
        for (int i = 0; i < list.size(); i++) {
            int l1 = list.get(i);
            int l2;
            if (i == list.size() - 1) {
                l2 = list.get(0);
            } else {
                l2 = list.get(i + 1);
            }
            map.put(l1, l2);
        }
        int[] arr = new int[10001];
        for (int num : nums) {
            arr[num]++;
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (arr[key]-- > 0 && arr[value]-- > 0) {
                ans++;
            }
        }
        return ans;
    }
}
