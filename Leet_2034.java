package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author SouthWind
 * @date 2022/1/23
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_2034 {

    public static void main(String[] args) {

    }

    class StockPrice {
        // 时间-价格
        Map<Integer, Integer> map;
        // 记录价格
        TreeMap<Integer, Integer> priceMap;
        //最新时间
        int currentTime = -1;

        public StockPrice() {
            map = new HashMap<>();
            priceMap = new TreeMap<>();
        }

        public void update(int timestamp, int price) {
            if (map.containsKey(timestamp)) {
                int value = map.get(timestamp);
                int priceCount = priceMap.get(value);
                if (--priceCount == 0) {
                    priceMap.remove(value);
                } else {
                    priceMap.put(value, priceCount);
                }
            }
            priceMap.put(price, priceMap.getOrDefault(price, 0) + 1);
            map.put(timestamp, price);
            currentTime = Math.max(currentTime, timestamp);
        }

        public int current() {
            return map.get(currentTime);
        }

        public int maximum() {
            return priceMap.lastKey();
        }

        public int minimum() {
            return priceMap.firstKey();
        }
    }
}
