package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SouthWind
 * @date 2022/9/19 8:06
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1636 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            list.sort((o1, o2) -> {
                int v1 = map.get(o1);
                int v2 = map.get(o2);
                if (v1 == v2) {
                    return o2 - o1;
                }
                return v1 - v2;
            });
            return list.stream().mapToInt(Integer::byteValue).toArray();
        }
    }
}
