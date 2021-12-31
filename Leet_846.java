package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SouthWind
 * @date 2021/12/30
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_846 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        System.out.println(isNStraightHand(arr, groupSize));
    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        if (len % groupSize != 0) return false;
        Map<Integer, Integer> treeMap = new HashMap<>();
        for (int n : hand) {
            treeMap.put(n, treeMap.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if (v == 0) continue;
            for (int i = 0; i < groupSize; i++) {
                int key = k + i;
                if (!treeMap.containsKey(key)) {
                    return false;
                }
                int value = treeMap.get(key);
                if (value < v) return false;
                treeMap.put(key, value - v);
            }
        }
        return true;
    }
}
